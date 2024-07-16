package madvirus.guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.io.StringReader;
import java.io.Reader;
import java.io.IOException;

import madvirus.DBUtil;

public class GuestBookManager {
    private static GuestBookManager instance = new GuestBookManager();

    public static GuestBookManager getInstance() {
        return instance;
    }

    private GuestBookManager() {}

    public void insert(GuestBook book) throws GuestBookException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBUtil.getConnection("pool");
            pstmt = conn.prepareStatement(
            "insert into GUESTBOOK (REGISTER,NAME,EMAIL,PASSWORD,CONTENT) "+
            "values (?,?,?,?,?)");

            pstmt.setTimestamp(1, book.getRegister());
            pstmt.setString(2, book.getName());
            pstmt.setString(3, book.getEmail());
            pstmt.setString(4, book.getPassword());
            pstmt.setCharacterStream(5,
              new StringReader(book.getContent()), book.getContent().length());

            pstmt.executeUpdate();
            
        } catch(SQLException ex) {
            throw new GuestBookException("insert", ex);
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }

    public void update(GuestBook book) throws GuestBookException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBUtil.getConnection("pool");
            pstmt = conn.prepareStatement(
            "update GUESTBOOK set NAME=?,EMAIL=?,CONTENT=? "+
            "where GUESTBOOK_ID = ?");

            pstmt.setString(1, book.getName());
            pstmt.setString(2, book.getEmail());
            pstmt.setCharacterStream(3,
              new StringReader(book.getContent()), book.getContent().length());
            pstmt.setInt(4, book.getId());

            pstmt.executeUpdate();
        } catch(SQLException ex) {
            throw new GuestBookException("update", ex);
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }

    public void delete(int guestBookId) throws GuestBookException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBUtil.getConnection("pool");
            pstmt = conn.prepareStatement(
            "delete from GUESTBOOK where GUESTBOOK_ID = ?");
            pstmt.setInt(1, guestBookId);
            pstmt.executeUpdate();
        } catch(SQLException ex) {
            throw new GuestBookException("delete", ex);
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }

    public int getCount() throws GuestBookException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection("pool");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from GUESTBOOK");
            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch(SQLException ex) {
            throw new GuestBookException("getCount", ex);
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }

    public List getList(int startRow, int endRow)
    throws GuestBookException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection("pool");
            pstmt = conn.prepareStatement(
            "select * from GUESTBOOK order by GUESTBOOK_ID desc "+
            "limit ?, ?" );
            pstmt.setInt(1, startRow - 1);
            pstmt.setInt(2, endRow - startRow);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                List list = new java.util.ArrayList(endRow-startRow+1);
                do {
                    GuestBook book = new GuestBook();
                    book.setId(rs.getInt("GUESTBOOK_ID"));
                    book.setRegister(rs.getTimestamp("REGISTER"));
                    book.setName(rs.getString("NAME"));
                    book.setEmail(rs.getString("EMAIL"));
                    book.setPassword(rs.getString("PASSWORD"));

                    Reader reader = null;
                    try {
                        reader = rs.getCharacterStream("CONTENT");
                        char[] buff = new char[512];
                        int len = -1;
                        StringBuffer buffer = new StringBuffer(512);
                        while( (len = reader.read(buff)) != -1) {
                            buffer.append(buff, 0, len);
                        }
                        book.setContent(buffer.toString());
                    } catch(IOException iex) {
                        throw new GuestBookException("getList", iex);
                    } finally {
                        if (reader != null)
                            try {
                                reader.close();
                            } catch(IOException iex) {}
                    }
                    list.add(book);
                } while(rs.next());
                return list;
            } else {
                return java.util.Collections.EMPTY_LIST;
            }
        } catch(SQLException ex) {
            throw new GuestBookException("getList", ex);
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    public GuestBook getGuestBook(int guestBookId) throws GuestBookException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection("pool");
            pstmt = conn.prepareStatement(
            "select * from GUESTBOOK where GUESTBOOK_ID = ? ");
            pstmt.setInt(1, guestBookId);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                GuestBook book = new GuestBook();
                book.setId(rs.getInt("GUESTBOOK_ID"));
                book.setRegister(rs.getTimestamp("REGISTER"));
                book.setName(rs.getString("NAME"));
                book.setEmail(rs.getString("EMAIL"));
                book.setPassword(rs.getString("PASSWORD"));

                Reader reader = null;
                try {
                    reader = rs.getCharacterStream("CONTENT");
                    char[] buff = new char[512];
                    int len = -1;
                    StringBuffer buffer = new StringBuffer(512);
                    while( (len = reader.read(buff)) != -1) {
                        buffer.append(buff, 0, len);
                    }
                    book.setContent(buffer.toString());
                } catch(IOException iex) {
                    throw new GuestBookException("getGuestBook", iex);
                } finally {
                    if (reader != null)
                        try {
                            reader.close();
                        } catch(IOException iex) {}
                }
                return book;
            } else {
                return null;
            }
        } catch(SQLException ex) {
            throw new GuestBookException("getGuestBook", ex);
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
}