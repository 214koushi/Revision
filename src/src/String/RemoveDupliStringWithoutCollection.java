package src.String;

public class RemoveDupliStringWithoutCollection {

	public static void main(String[] args) {
		String s1="MadhuM";
		char [] ch =s1.toCharArray();
		int count =0;
		for(int i=0;i<ch.length;i++)
		{

			for(int j=i+1;j<ch.length;j++)
			{

				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}


	}

}
