public class Manager extends Employee{
    int deptId;
    public Manager(int id, String name , int salary ,int deptId){
        super(id,name,salary);
        this.deptId = deptId;
    }
    void getDetails(){
        super.getDetails();
        System.out.println("deptId: "+deptId);
    }

}
