import java.util.Scanner;
	public class minicalculadora{
		public static void main(String[] args){
Scanner sc = new Scanner(System.in);
	int p, q;
	int vector[] = new int [20];
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();
		do{
			if (p==1){
System.out.println("Suma de dos numeros");
System.out.println("Ingrese el primer número");
	vector [1]=sc.nextInt();
System.out.println("Ingrese el segundo número");
	vector [2]=sc.nextInt();
	vector [3]=vector [1]+vector[2];
System.out.println("La suma de los dos números es:"+vector [3]);
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
		p = sc.nextInt();
}
			if (p==2){
System.out.println("Resta de dos numeros");
System.out.println("Ingrese el primer número");
	vector [4]=sc.nextInt();
System.out.println("Ingrese el segundo número");
	vector [5]=sc.nextInt();
	vector [6]=vector [4]-vector[5];
System.out.println("La resta de los dos números es:"+vector [6]);
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();
}
			if (p==3){
System.out.println("Multiplicación de dos numeros");
System.out.println("Ingrese el primer número");
	vector [7]=sc.nextInt();
System.out.println("Ingrese el segundo número");
	vector [8]=sc.nextInt();
	vector [9]=vector [7]*vector[8];
System.out.println("La multiplicación de los dos números es:"+vector [9]);
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();
}
			if (p==4){
System.out.println("División de dos numeros");
System.out.println("Ingrese el primer número");
	vector [10]=sc.nextInt();
System.out.println("Ingrese el segundo número");
	vector [11]=sc.nextInt();
		if (vector [11]==0){
System.out.println("error no se puede dividir entre 0");
}
		if (vector [11] < 0){
	vector [12]=vector [10]/vector[11];
System.out.println("La división de los dos números es:"+vector [12]);
}
			if (vector [11] > 0){
	vector [12]=vector [10]/vector[11];
System.out.println("La división de los dos números es:"+vector [12]);
}
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
p = sc.nextInt();
}
			if(p==5){
System.out.println("Bitácora");
System.out.println(vector [1]+"+"+vector [2]+"="+vector [3]);
System.out.println(vector [4]+"-"+vector [5]+"="+vector [6]);
System.out.println(vector [7]+"*"+vector [8]+"="+vector [9]);
System.out.println(vector [10]+"/"+vector [11]+"="+vector [12]);
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();
}
			if(p==6){
System.out.println("Borrar Bitácora");
System.out.println("¿Desea borrar su bitácora?");
System.out.println("Presione '1' para continuar ó presione '2' para volver al menú.");
	q = sc.nextInt();
			if(q==1){
			for(int a=0;a<=12;a++){
	vector[a] = 0; 
System.out.println("Se ha vaciado la bitácora.");
}
}
			if(q==2){
System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();
}System.out.println(" ");
System.out.println("Opciones");
System.out.println("1) Suma de dos numeros"); 
System.out.println("2) Resta de dos numeros"); 
System.out.println("3) Multiplicación de dos numeros"); 
System.out.println("4) División  de dos numeros"); 
System.out.println("5) Ver Bitácora"); 
System.out.println("6) Borrar Bitácora"); 
System.out.println("7) Salir"); 
	p = sc.nextInt();}
	if(p==7){
System.out.println("HA SALIDO DEL PROGRAMA");
			break;
}
}while(p <= 8);
}}