import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class GUI  implements ActionListener{
	JFrame $myFrame;
	Container $myCon;
	JButton $allEmp;
	JButton $sal;
	JButton $avgSal;
	
	public void initGUI(){
		$myFrame = new JFrame();
		$myCon = $myFrame.getContentPane();
		$myCon.setLayout(new FlowLayout());
		
		$allEmp = new JButton("All Employee Record");
			$allEmp.addActionListener(this);
		$sal = new JButton("Employee Having Salry > 10K");
			$sal.addActionListener(this);
		$avgSal = new JButton("Average Salary"); 
			$avgSal.addActionListener(this);
		JLabel $lab = new JLabel("Employee Management System");
		
		$myCon.add($allEmp);
		$myCon.add($sal);
		$myCon.add($avgSal);
		$myCon.add($lab);
		
		$myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		$myFrame.setSize(500,100);
		$myFrame.setVisible(true);
		
	}
	public GUI(){
		initGUI();
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()== $allEmp){
			EmployeeDB $em = new EmployeeDB();
			$em.employeeRecords(0);
		}
		if(ae.getSource()== $sal){
			EmployeeDB $em = new EmployeeDB();
			$em.employeeRecords(1);
		}
		if(ae.getSource()== $avgSal){
			EmployeeDB $em = new EmployeeDB();
			System.out.println($em.averageSalary());
		}
		
	}
	

}