import java.util.Scanner;

class Addition{

public static void main(String args[]) {

// Create Scanner object 
Scanner sc = new Scanner(System.in);

// Get size of matrices

System.out.println("Enter the size of arrays:"); 
int n = sc.nextInt();

// Create three matrices

int[][] A = new int[n][n];

int[][] B = new int[n][n];

int[][] C = new int[n][n];

// Enter elements of Matrix A 
System.out.println("Enter the elements of Matrix A:");

for (int i = 0; i <n; i++) { 
for (int j = 0; j<n; j++) { 
A[i][j] = sc.nextInt();
}
}

// Enter elements of Matrix B System.out.println("Enter the elements of Matrix B:");

for (int i = 0; i < n; i++) { 
for (int j = 0; j<n; j++) { 
B[i][j] = sc.nextInt();
}
}
// Add Matrix A and Matrix B 
for (int i = 0; i <n; i++) {
for (int j = 0; j <n; j++) { 
C[i][i] = A[i][i] + B[i][j];
}
}
// Display Matrix C 
System.out.println("Matrix C (A + B):");
for (int i = 0; i <n; i++) {
for (int j= 0; j <n; j++) {
System.out.print(C[i][j] + "");
}
System.out.println();
}
sc.close();
}
}