package tv.business;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import tv.util.DBUtil;

public class ShowDB implements ShowDAO {

	
	
		
	// n ShowDB.getAll() method, change the 'try' statement to the following:  
	// try (Connection connection = DBUtil.getConnection();

	public List<Show> getAll() {
		
		String sql = "SELECT * FROM tvshow";
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt(1);
				String name= rs.getString(2);
				String rating = rs.getString(3);
				int length = rs.getInt(4);
				String genre = rs.getString(5);
				String network = rs.getString(6);
				Show s = new Show(id,name,rating,length,genre,network);
				shows.add(s);
			}
			
		}
				catch (SQLException e ) {
					e.printStackTrace();
				}
		return shows;
	}
	
	@Override
	public List<Show> get(String genre) {
		String sql = "select * from tvshow where genre = ? ";
		List <Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setString(1, genre);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name= rs.getString(2);
				String rating = rs.getString(3);
				int length = rs.getInt(4);
				String g = rs.getString(5);
				String network = rs.getString(6);
				Show s = new Show(id,name,rating,length,genre,network);
				shows.add(s);		
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return shows;
	}

	@Override
	public boolean add(Show s) {
		// TODO Auto-generated method stub not yet implemented
		return false;
	}

	@Override
	public boolean update(Show s) {
		// TODO Auto-generated method stub not yet implemented
		return false;
	}

	@Override
	public boolean delete(Show s) {
		// TODO Auto-generated method stub not yet implemented
		return false;
	}


	@Override
	public List<Show> get(int length) {
		
		String sql = "SELECT * FROM tvshow";
		List<Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt(1);
				String name= rs.getString(2);
				String rating = rs.getString(3);
				int l = rs.getInt(4);
				String genre = rs.getString(5);
				String network = rs.getString(6);
				Show s = new Show(id,name,rating,l,genre,network);
				shows.add(s);
			}
			
		}
				catch (SQLException e ) {
					e.printStackTrace();
				}
		return shows;
		
	}
	
	
}
