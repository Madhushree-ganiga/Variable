class Test
{
public static void main(String args[])
{
byte marks[]={90,89,67,87,98,90};
byte index=0;
int sum=0;
for(index=0;index<marks.length;index++)
{
System.out.println(marks[index]);
sum=sum+marks[index];
}
System.out.println(marks.length);
System.out.println(sum/marks.length);

}
}