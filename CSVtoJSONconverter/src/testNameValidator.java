class testNameValidator{
    public static void main(String[] args) {
    	NameValidator csvObject=new NameValidator();
    	boolean checkValidator=csvObject.nameValidator("example.csv","csv");
    	System.out.println(checkValidator);
    	checkValidator=csvObject.nameValidator("","csv");
    	System.out.println(checkValidator);
    	checkValidator=csvObject.nameValidator("123","csv");
    	System.out.println(checkValidator);

		
	}
}