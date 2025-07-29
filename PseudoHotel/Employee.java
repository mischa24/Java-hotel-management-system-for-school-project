public class Employee {
     private int id;
     private String name;
     private String role;
     
     public Employee(int id, String name, String role) {
         this.id = id;
         this.name = name;
         this.role = role;
        }
        
        public int getId() {
            return id;
        }
        
        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public void showEmployeeDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Role: " + role);
            System.out.println("--------------------------");
        }      
        
        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Role: " + role;
        }
    }