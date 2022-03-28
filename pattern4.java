package pack;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a='D';
		
		for(int i=1;i<=4;i++)
        {
			a='D';
            for(int j=4;j>=i;j--)
            {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }

	}

}
