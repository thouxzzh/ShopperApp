public class JenkinsProject3{
public static void main(String args[]){
if(args.length<2){
System.out.println("Usage:parameterInput <name><age>");
}
String Name=args[0];
int Age=Integer.parseInt(args[1]);
System.out.println("Hello "+Name+ "You are "+Age+ "old");
}
}
