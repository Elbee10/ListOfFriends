
import java.util.ArrayList;
import java.util.Scanner;
	public class Person {
	    private String name;
	    private String nationality;
	    private String dateOfBirth;
	    private String address;
	    static private int nbOfFrnds;
	    ArrayList<Person> listFrnds = new ArrayList<>();
	    Scanner scan = new Scanner(System.in);

	    public Person(String n, String nat, String add) {
	        this.name = n;
	        this.nationality = nat;
	        this.address = add;
	    }


	    public String getName() {
	        return name;
	    }

	    public String getNationality() {
	        return nationality;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public String getAdd() {
	        return address;
	    }

	    public Person(String n, String dOfB, String nat, String add) {
	        this(n, nat, add);
	        this.dateOfBirth = dOfB;

	    }

	    public void CreatListOfFrnds() {
	        System.out.print("number of friends:");
	        nbOfFrnds = scan.nextInt();
	        scan.nextLine();
	        for (int i = 1; i <= nbOfFrnds; i++) {

	            System.out.print("name:");
	            name = scan.nextLine();
	            System.out.print("nationality:");
	            nationality = scan.nextLine();
	            System.out.print("address:");
	            address = scan.nextLine();
	            listFrnds.add(new Person(name, nationality, address));
	        }
	    }

	    public void addDude(Person p) {
	        listFrnds.add(p);
	        nbOfFrnds++;
	    }

	    public void myFrndsList() {
	        if (nbOfFrnds!= 0) {
	            for (int i = 0; i <= (nbOfFrnds - 1); i++) {

	                System.out.print(listFrnds.get(i).toString());
	            }
	        } else
	            System.out.print("liste is empty");
	    }

	    public void myAlgDudes()

	    {
	        if (nbOfFrnds != 0) {
	            {
	                for (int i = 0; i <= (nbOfFrnds - 1); i++) {
	                    if (listFrnds.get(i).nationality.contentEquals("algeria")) {
	                        System.out.print(listFrnds.get(i).toString());
	                    }
	                }
	            }

	        } else
	            System.out.print("list is empty");
	    }

	    public String toString() {
	        return
	                "\nname:'" + name + '\'' +
	                        ",\nnationality:'" + nationality + "\naddress:" + address;
	    }

	    public void myForignDudes() {
	        if (nbOfFrnds != 0) {
	            for (int i = 0; i <= (nbOfFrnds - 1); i++) {
	                if (!listFrnds.get(i).nationality.contentEquals("algeria")) {
	                    System.out.print(i + "" + listFrnds.get(i).toString());
	                }
	            }
	        } else
	            System.out.print("list is empty");
	    }

	    public void deleteDudes(int choice) {

	        if (nbOfFrnds != 0) {
	            listFrnds.remove((choice - 1));
	            nbOfFrnds--;
	            myFrndsList();
	        } else
	            System.out.print("your friends list is empty");
	    }
	}
  //Main 
  import java.util.Scanner;
public class MainP {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Bienvenue dans listAmis" +
	                "il est obligatoire de crée un compte avant de commencer ");
	        System.out.print("\nUser Name :");
	        String userNam = scan.nextLine();

	        System.out.print("\nDate de naissance:");
	        String dateOfB = scan.nextLine();

	        System.out.print("\nnationality:");
	        String nat = scan.nextLine();
	        System.out.print("\naddress:");
	        String add = scan.nextLine();
	        Person p = new Person(userNam, dateOfB, nat, add);

	        System.out.print("User" + userNam
	                + "\nnationality :" + nat
	                + "\naddress :" + add);
	        System.out.print("\n=========");
	        boolean dope = true;
	        while (dope) {
	            System.out.print("\n1)creation and implementing the list");
	            System.out.print("\n2)add friend");
	            System.out.print("\n3)delete friend");
	            System.out.print("\n4)print out a friend");
	            System.out.print("\n5)algerian dudes");
	            System.out.print("\n6)forign dudes");
	            System.out.println("\n7)done");
	            switch (scan.nextInt()) {


	                case 1:
	                    p.CreatListOfFrnds();
	                    break;
	                case 2:
	                    scan.nextLine();
	                    System.out.print("\nname:");
	                    String name = scan.nextLine();
	                    System.out.print("\nnationality:");
	                    nat = scan.nextLine();
	                    System.out.print("\naddress:");
	                    add = scan.nextLine();
	                    p.addDude(new Person(name, nat, add));
	                    break;
	                case 3:
	                    p.myFrndsList();
	                    System.out.print("\nID dude was deleted:");
	                    int choice = scan.nextInt();
	                    p.deleteDudes(choice);
	                    break;
	                case 4:
	                    p.myFrndsList();
	                    break;
	                case 5:
	                    p.myAlgDudes();
	                    break;
	                case 6:
	                    p.myForignDudes();
	                    break;
	                case 7:
	                    dope = false;
	                    break;
	                default:
	                    System.err.print("\nError");
	                    break;


	            }


	        }

	    }
	}
