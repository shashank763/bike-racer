import java.io.*;
import java.util.*;
public class BikeRacers {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
int speed[]=new int[5];
for(int i=0;i<5;i++) {
	System.out.println("Enter the speed of the racer:"+(i+1)+": ");
	speed[i]=s.nextInt();

}
int sum=0;
for(int i=0;i<5;i++) 
	sum+=speed[i];
	double avg=sum/5;
	System.out.println("Average Speedof Bikeraces is:"+avg);
	System.out.println("The Speed of qualifing racers are:");
	

for(int i=0;i<5;i++) {
	if(speed[i] >= avg) { 
		System.out.println("Racer:"+(i+1)+": "+speed[i]);}
}
}
}