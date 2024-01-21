import java.sql.*;
public class EmployeeDB{
	Connection $con;
	public Connection getConnection(){
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String $url = "jdbc:odbc:EmployeeDSN";
			$con = DriverManager.getConnection($url);
		}
		catch (Exception ex){}
		return $con;
	}
	public EmployeeDB(){
		getConnection();
	}
	public void employeeRecords(int $chk){
		String $query;
		Statement $st;
		ResultSet $rs;
		try{
			$st = $con.createStatement();
			if ($chk==0){
				$query = "SELECT * FROM Employee";
				$rs = $st.executeQuery($query);
				System.out.println("  *** ALL EMPLOYEES RECORD ***");
				System.out.println("ID\tName\tAge\tSalary");
				while($rs.next()){
					String id = $rs.getString("ID");
					String name = $rs.getString("Name");
					String age = $rs.getString("Age");
					String salary = $rs.getString("Salary");
					System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
				}
				System.out.println("\n");
			} else{
				$query = "SELECT * FROM Employee WHERE Salary>10000";
				$rs = $st.executeQuery($query);
				System.out.println("  *** ALL EMPLOYEES RECORD HAVING SALARY > 10K ***");
				System.out.println("ID\tName\tAge\tSalary");
				while($rs.next()){
					String id = $rs.getString("ID");
					String name = $rs.getString("Name");
					String age = $rs.getString("Age");
					String salary = $rs.getString("Salary");
					System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
				}
			System.out.println("\n");
			}
		}
		catch (Exception ex){}
	}
	public String averageSalary(){
		int sum=0;
		int count=0;
		try{
			Statement $st = $con.createStatement();
			String $query = "SELECT * FROM Employee";
			ResultSet $rs = $st.executeQuery($query);
			System.out.println("  *** ALL EMPLOYEES AVERAGE SALARY ***");
			while($rs.next()){
				String salary = $rs.getString("Salary");
				sum = sum + Integer.parseInt(salary);
				count++;
			}
			return "Average = "+(sum/count);
		}
		catch (Exception ex){
			return "ERROR";
		}
	}
	/*public ~EmployeeDB(){
		$con.close();
	}*/
	

}