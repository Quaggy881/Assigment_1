import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Task_2 {

	public static void main(String[] args) {
		
		//declaration of variables
		String name1, name2, name3, time1_1, time2_2, time3_3 ; 
		double time1, time2, time3 ;
		
		//adding image to the dialogue box
		ImageIcon icon1 = new ImageIcon("aa.jpg");
		
		//accepting user input for both names and time
		name1 = JOptionPane.showInputDialog("Input the name of the first racer");
		name2 = JOptionPane.showInputDialog("Input the name of the second racer");
		name3 = JOptionPane.showInputDialog("Input the name of the third racer");
		
		time1_1 = JOptionPane.showInputDialog("Input the time of the first racer");
		time2_2 = JOptionPane.showInputDialog("Input the time of the second racer");
		time3_3 = JOptionPane.showInputDialog("Input the time of the third racer");
		
		time1 = Double.parseDouble(time1_1);
		time2 = Double.parseDouble(time2_2);
		time3 = Double.parseDouble(time3_3);
		
		//results when name1 is first place
		if ((time1 > time2) && (time1 > time3)) {
			if (time2 > time3) {
				JOptionPane.showMessageDialog(null, "1st: " + name3 + " " + time3 + " minutes" + "\n\n2nd: " + name2 + " " + time2 + " minutes" + "\n\n3rd: " + name1 + " " + time1 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1 );
			}
			else if (time3 > time2) {
				JOptionPane.showMessageDialog(null, "1st: " + name2 + " " + time2 + " minutes" + "\n\n2nd: " + name3 + " " + time3 + " minutes" + "\n\n3rd: " + name1 + " " + time1 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1 );				
			}
			else {
				JOptionPane.showMessageDialog(null, "1st: " + name2 + " & " + name3 + " are tied with the time of " + time2 + " minutes" + "\n\n2nd: " + name1 + " " + time1 + "minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1 );
			}		
		}
		
		//results when name2 is first place
		else if ((time2 > time1) && (time2 > time3)) {
			if (time1 > time3) {
				JOptionPane.showMessageDialog(null, "1st: " + name3 + " " + time3 + " minutes" + "\n\n2nd: " + name1 + " " + time1 + "minutes" + "\n\n3rd: " + name2 + " " + time2 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1 );
			}
			else if (time3 > time1) {
				JOptionPane.showMessageDialog(null, "1st: " + name1 + " " + time1 + " minutes" + "\n\n2nd: " + name3 +" " + time3 + " minutes" + "\n\n3rd: " + name2 + " " + time2 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1 );		
			}
			else {
				JOptionPane.showMessageDialog(null,"1st: " + name1 + " & " + name3 + " are tied with the time of " + time1 + " minutes" + "\n\n2nd: " + name2 + " " + time2 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		}
		
		//results when name3 is first place
		else if ((time3 > time1)&& (time3 > time2)) {
			if (time1 > time2) {
				JOptionPane.showMessageDialog(null,"1st: " + name2 + " " + time2 + " minutes" + "\n\n2nd: " + name1 + " " + time1 + " minutes" + "\n\n3rd: " + name3 + " " + time3 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
			else if (time2 > time1) {
				JOptionPane.showMessageDialog(null,"1st: " + name1 + " " + time1 + " minutes" + "\n\n2nd: " + name2 + " " + time2 + " minutes" + "\n\n3rd: " + name3 + " " + time3 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
			else {
				JOptionPane.showMessageDialog(null, "1st: " + name1 + " & " + name2 + " are tied with the time of " + time1 + " minutes" + "\n\n2nd: " + name3 + " " + time3 + "minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		}
		
		//results when there is a tie for second place, or all names have the same time
		else {
			if ((time1 < time2) && (time2 == time3)) {
				JOptionPane.showMessageDialog(null,"1st: " + name1 + " " + time1 + " minutes" + "\n\n2nd: " + name2 + " & " + name3 + " are tied with the time of " + time2 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
			else if ((time2 < time1) && (time1 == time3)) {
				JOptionPane.showMessageDialog(null, "1st: " + name2 + " " + time2 + " minutes" + "\n\n2nd: " + name1 + " & " + name3 + " are tied with the time of " + time1 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
			else if ((time3 < time1) && (time1 == time2)){
				JOptionPane.showMessageDialog(null, "1st: " + name3 + " " + time3 + " minutes" + "\n\n2nd: " + name2 + " & " + name1 + " are tied with the time of " + time2 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}
			else {
				JOptionPane.showMessageDialog(null, "Contestants " + name1 + ", " + name2 + " & " + name3 + " all have the same time of " + time1 + " minutes", "Rankings", JOptionPane.INFORMATION_MESSAGE, icon1);
			}		
		} 
		
		
		
	
				
				

	}

}
