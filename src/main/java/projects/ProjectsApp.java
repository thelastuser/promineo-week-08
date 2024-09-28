package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		// In the main() method, call the DbConnection.getConnection() method.
		DbConnection.getConnection();
	}

}
