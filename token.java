import java.util.*;
import java.io.File;

class token
{
	static String keyword[]={"include","int","auto","break","case","char","continur","default","do","double","while","long","return","switch","void","struct"};
	static String specialchar[]={"!","@","#","$","%","^","&","*","(",")","'",",",".","/","[","]","_","~",":",";","{","}",'"'," "};
	static String operators[]={"/","+","-","*","<",">","=","%"};
	static String predefinedfunction[]={"main","printf","scanf"};
	
	public static boolean iskeyword(String s)
	{
		if(s.equals("include") || s.equals("int") || s.equals("auto")  || s.equals("break") || s.equals("case")
			|| s.equals("char") || s.equals("continue") || s.equals("default") || s.equals("do") || s.equals("double") 
		|| s.equals("else") || s.equals("float") || s.equals("for") || s.equals("goto") || s.equals("if") 
		|| s.equals("while") || s.equals("long") || s.equals("return") || s.equals("switch") || s.equals("void") 
		|| s.equals("struct") )
		return true;
		else
			return false;
	}
	
	public static boolean isspecialchar(String s)
	{
		if(s.equals("!") ||  s.equals("@") || s.equals("#") || s.equals("$") || s.equals("%") || s.equals("^") || s.equals("&") ||
		 s.equals("*") || s.equals("(") || s.equals(")") || s.equals("'") || s.equals(",") || s.equals(".") || s.equals("/") ||
		  s.equals("[") || s.equals("]") || s.equals("_") || s.equals("~") || s.equals(":") || s.equals(";") || s.equals("{") || s.equals("}") 
		  || s.equals('"'))
		  return true;
		else
			  return false;
	}
	
	public static boolean isinteger(String s)
	{
		if(s.equals("0")  || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") ||
		 s.equals("7") || s.equals("8") || s.equals("9"))
		 return true;
		 else
		return false;
	}
	
	public static boolean isafunction(String s)
	{
		if(s.equals("scanf") || s.equals("printf") || s.equals("main"))
			return true;
		else
			return false;
	}
	
	public static boolean isheader(String s)
	{
		if(s.equals("stdio.h") || s.equals("file") || s.equals("conio.h") )
			return true;
		else
			return false;
	}
	
	public static boolean isoperator(String s)
	{
		if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") || s.equals("=") || s.equals("<") || s.equals(">"))
			return true;
		else
			return false;
	}
	
	public static boolean isavar(String s)
	{
		if(s.equals("a") || s.equals("b") || s.equals("c") || s.equals("d") || s.equals("e") || s.equals("f") || s.equals("g") || s.equals("h")
			|| s.equals("i") || s.equals("j") || s.equals("k") || s.equals("l") || s.equals("m") || s.equals("n")|| s.equals("o") || s.equals("p") 
		|| s.equals("q") || s.equals("r") || s.equals("s") || s.equals("t") || s.equals("u") || s.equals("v") || s.equals("w")
		|| s.equals("x") || s.equals("y") || s.equals("z"))
		return true;
		else return false;
	}
	
	public static void check(String s)
	{
				if(iskeyword(s)==true)
				{
					System.out.println(s+" :Keyword");
				}
				else if(isspecialchar(s)==true)
				{
					System.out.println(s+" :Special_character");
				}
				else if(isinteger(s)==true)
				{
					System.out.println(s+" :Integer");
				}
				else if(isafunction(s)==true)
				{
					System.out.println(s+" :pre-defined function");
				}
				else if(isheader(s)==true)
				{
					System.out.println(s+" :header file");
				}
				else if(isoperator(s)==true)
				{
					System.out.println(s+" :operator ");
				}
				else if(isavar(s)==true)
				{
					System.out.println(s+" :variable");
				}
	}
	public static void main(String args[]) throws Exception 
	{
		File file = new File("C:\\Users\\Dikshita\\Desktop\\sem 6\\spcc\\fibo.c"); 
		Scanner sc = new Scanner(file); 
		String line;
		
		while(sc.hasNextLine())
		{
			line=sc.nextLine();
			String[] words = line.split("");
			int n=words.length;
			for(int i=0;i<n;i++)
			{
				if(iskeyword(words[i])==true)
				{
					System.out.println(words[i]+" :Keyword");
					continue;
				}
				else if(isspecialchar(words[i])==true)
				{
					System.out.println(words[i]+" :Special_character");
					continue;
				}
				else if(isinteger(words[i])==true)
				{
					System.out.println(words[i]+" :Integer");
					continue;
				}
				else if(isafunction(words[i])==true)
				{
					System.out.println(words[i]+" :pre-defined function");
					continue;
				}
				else if(isheader(words[i])==true)
				{
					System.out.println(words[i]+" :header file");
					continue;
				}
				else if(isoperator(words[i])==true)
				{
					System.out.println(words[i]+" :operator ");
					continue;
				}
				else if(isavar(words[i])==true)
				{
					System.out.println(words[i]+" :variable");
					continue;
				}
				else
				{
					String s=words[i];
					for(int j=0;j<s.length();j++)
					{
						for(int k=0;k<specialchar.length;k++)
						{
						if(s.charAt(j)==specialchar[k])
						{
							System.out.println(s.charAt(j)+" :special character");
							String str=s.substring(j++,s.length());
							check(str);
						}
					}
				}
			}
		}
		
	}
}