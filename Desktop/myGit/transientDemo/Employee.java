package TransientAndSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

	
	private static final long serialVersionUID = -11343432L;
	
	//a transient variable will not be serialized in the streams
	//so in other words, the variable won't be obtainable after deserialization
	private String name;
	private transient int bankAccount;
	
	public String getName(){
		return name;
	}
	public int getBankAccount(){
		return bankAccount;
	}
	public Employee(String name, int bankAccount){
		super();
		this.name=name;
		this.bankAccount=bankAccount;
	}

	public static void main(String[] args){
		//you could comment out the method you aren't using
		serialize();
		deserialize();
	}
	private static void serialize(){
		Employee e = new Employee("Bob",77374);
		try{
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("Serialized employee is saved in Employee.txt");
		}catch(IOException exception){
			exception.printStackTrace();
		}
	}
	private static void deserialize() {
		Employee e = null;
		try{
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e = (Employee)ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException i){
			i.printStackTrace();
		}catch(ClassNotFoundException c){
			c.printStackTrace();
		}
		System.out.println("Deserialized the employee");
		System.out.println("Name: "+e.getName());
		System.out.println("Bank Account: "+e.getBankAccount());
	}
}
