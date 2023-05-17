#include<stdio.h>
void butterfly_pattern();
void solid_rhombus_pattern();
void hollow_rhombus_pattern();
void diamond_pattern();

void butterfly_pattern()
{
    int x;
    // Input number of rows from user 
    printf("Enter the number of rows: ");
    scanf("%d",&x);
    int spaces = (2 * x ) - 2;
    //first half of the pattern 
    for(int i = 1; i <= x;i++)
    {
      //print left side of pattern
      for(int j = 0;j < i;j++)
      {
        printf("*");
      }
      //print the spaces 
      for(int j=0;j<spaces;j++)
      {
        printf(" ");
      }
      //print right side of pattern
      for(int j =0;j<i;j++)
      {
        printf("*");
      }
      printf("\n");
      spaces-=2;
    }
    spaces = 0;
 //Second half of the pattern 
    for(int i = x; i > 0;i--)
    {
      //print left side of pattern
      for(int j = 0;j < i;j++)
      {
        printf("*");
      }
      //print the spaces 
      for(int j=0;j<spaces;j++)
      {
        printf(" ");
      }
      //print right side of pattern
      for(int j =0;j<i;j++)
      {
        printf("*");
      }
      printf("\n");
      spaces+=2;
    }
    
    
}

void solid_rhombus_pattern()
{
    int i, j, rows;

    // Input number of rows from user 
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for(i=1; i<=rows; i++)
    {
        // Print trailing spaces 
        for(j=1; j<=rows - i; j++)
        {
            printf(" ");
        }

        // Print stars after spaces 
        for(j=1; j<=rows; j++)
        {
            printf("*");
        }

        // Move to the next line
        printf("\n");
    }

}

void hollow_rhombus_pattern()
{
    int i, j, rows;

    //Input number of rows from user 
    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for(i=1; i<=rows; i++)
    {
        // Print trailing spaces 
        for(j=1; j<=rows-i; j++)
        {
            printf(" ");
        }

        // Print stars and center spaces
        for(j=1; j<=rows; j++)
        {
            if(i==1 || i==rows || j==1 || j==rows)
                printf("*");
            else
                printf(" ");
        }

        printf("\n");
    }
}

void diamond_pattern()
{
  int n, c, k;
  printf("Enter number of rows: ");
  scanf("%d", &n);
// print upper part of diamond pattern
  for (k = 1; k <= n; k++)
  {
    // print trailing spaces
    for (c = 1; c <= n-k; c++)
      printf(" ");
    // print stars
    for (c = 1; c <= 2*k-1; c++)
      printf("*");
    // next line
    printf("\n");
  }
// print lower part of diamond pattern
  for (k = 1; k <= n - 1; k++)
  {
    // print trailing spaces
    for (c = 1; c <= k; c++)
      printf(" ");
    // print stars  
    for (c = 1 ; c <= 2*(n-k)-1; c++)
      printf("*");
    // next line  
    printf("\n");
  }
}

void main()
{
int number=0;     
printf("Enter 1 for printing Butterfly pattern, 2 for Solid Rhombus pattern, 3 for Hollow Rhombus pattern, 4 for Diamond pattern: ");    
scanf("%d",&number);    
switch(number){    
case 1:    
printf("Butterfly Pattern");
butterfly_pattern();   
break;    
case 2:    
printf("Solid Rhombus Pattern");
solid_rhombus_pattern();   
break;    
case 3:   
printf("Hollow Rhombus Pattern");
hollow_rhombus_pattern(); 
break;    
case 4:   
printf("Diamond Pattern");
diamond_pattern();
break; 
default:    
printf("Invalid choice");    
}     
}  


