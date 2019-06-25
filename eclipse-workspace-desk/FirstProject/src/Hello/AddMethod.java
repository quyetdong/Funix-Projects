package Hello;

public class AddMethod {
	public static void main(String[] args) {
		Add ob = new Add();
		ob.add(3, 5);
	}
}

class Add
{
    public void add(int ...arr){
        int sum=0;
        String s="";
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            s+=arr[i];
            if(i<arr.length-1)
                s+="+";
        }
        s+="="+sum;
        System.out.println(s);
    }

}