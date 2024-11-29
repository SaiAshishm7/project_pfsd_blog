// insertion sort
 #include <stdio.h>

void insertionSort(int arr[], int n) {
    int i, j, k;
    for (i = 1; i < n; i++) {
        k = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > k) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = k;
    }
}

int main() {
    int n, i;

    printf("\n Enter n: ");
    scanf("%d", &n);

    int a[n];

    printf("\n Enter n values: ");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    insertionSort(a, n);

    printf("\n The List after Insertion Sorting: ");
    for (i = 0; i < n; i++)
        printf("%d  ", a[i]);

    return 0;
}


// shell sort 

#include<stdio.h>
void shellSort(int a[],int n) 
{
int i,j,gap,temp;  // 33 31 40 8 12 17 25 42
for(gap=n/2;gap>=1;gap=gap/2) //gap=8/2=4
 {
for(j=gap;j<n;j++) //1. j=4,4<8 , 2. j=5,5<8, 3. j=6,6<8 4. j=7,7<8 5. j=8,8<8(false)
   {
    for(i=j-gap;i>=0;i=i-gap) //j=4 1.i=4-4=0, 2. i=0-4=-4 not> 0 // j=5
      {
        if(a[i]>a[i+gap]) //a[0]>a[0+4] = 33>12 - perform swapping
          {
            temp=a[i];
            a[i]=a[i+gap];
            a[i+gap]=temp;    
           }
      } }
 } }
void main()
{
  int n,i;
  printf("\n Enter n : "); 
  scanf("%d",&n);
  int a[n];
  printf("\n Enter n values: "); //33, 31, 40, 8, 12, 17, 25, 42
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  shellSort(a,n);
  printf("\n The List after Shell Sorting : ");
  for(i=0;i<n;i++)
    printf("%d  ",a[i]);
}


// quick sort

#include<stdio.h>
void QuickSort(int a[],int l,int h)
{
  int i,j,temp,pivot;
  if(l<h)
  {
     pivot=l;i=l;j=h;
     while(i<j)
     {
        while(a[i]<=a[pivot]) 
        i++;
        while(a[j]>a[pivot]) 
        j--;
        if(i<j)
      {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      }
    }
     temp=a[j];
     a[j]=a[pivot];
     a[pivot]=temp;// partition 
     QuickSort(a,l,j-1);//recursively call first sublist
     QuickSort(a,j+1,h);//j+1 to last index
  }
}
void main()
{
  int n,i;
  printf("\n Enter n : "); 
  scanf("%d",&n);
  int a[n];
  printf("\n Enter n values: "); //33, 31, 40, 8, 12, 17, 25, 42
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  QuickSort(a,0,n-1);
  printf("\n The List after Quick Sorting : ");
  for(i=0;i<n;i++)
    printf("%d  ",a[i]);
}
// merge sort 

#include<stdio.h>
void merge(int A[],int low, int mid, int high);
void mergesort(int A[],int low, int high)
{
  int mid;
  if(low<high)
  {
    mid=(low+high)/2;
    mergesort(A,low,mid);
    mergesort(A,mid+1,high);
    merge(A,low,mid,high);
  }
}

void merge(int A[],int low, int mid, int high)
{
  int i,j,k,n1,n2;
  n1=mid-low+1;
  n2=high-mid;
  int sl1[n1],sl2[n2];
  //copy the elements from orignal array to sublist
  for(i=0;i<n1;i++)
  sl1[i]=A[low+i];
  for(j=0;j<n2;j++)
  sl2[j]=A[mid+1+j];
  
  // comparing and sorting
  i=0;j=0;k=low;
  while(i<n1 && j<n2)
  {
    if(sl1[i]<=sl2[j])
    {
      A[k]=sl1[i];
      i++;
    }
    else
    {
      A[k]=sl2[j];
      j++;
      
    }
    k++;
  }
  
  //copying remaining elements from sublists to original array
  
  while(i<n1)
  {
    A[k]=sl1[i];
    i++;
    k++;    
  }
  
  while(j<n2)
  {
    A[k]=sl2[j];
    j++;
    k++;
  }
}

void main()
{
  int n,i;
  printf("enter the size of array");
  scanf("%d",&n);
  int A[n];
  printf("Enter the elements into the array");
  for(i=0;i<n;i++)
  scanf("%d",&A[i]);
  mergesort(A,0,n-1);
  printf("The sorted list is:");
  for(i=0;i<n;i++)
  printf("%d ",A[i]);  
}

// bucket sort


#include<stdio.h> 
#include<stdlib.h> 
void insertion(int a[],int n); 
 
int main() 
{ 
  int i,n,j,sr,er; 
   
  printf("Enter the size of array:"); 
  scanf("%d",&n); 
  int a[n]; 
  printf("Enter the values:"); 
   
  for(i=0;i<n;i++) 
  { 
    scanf("%d",&a[i]); 
  } 
   int b; 
   printf("Enter the no of buckets:"); 
   scanf("%d",&b); 
    
   int ba[b][n]; 
   int bs[b]; 
    
   for(i=0;i<b;i++) 
   { 
     bs[i]=0; 
   } 
    
    
   for(i=0;i<b;i++) 
   { 
     printf("Enter the range:"); 
     scanf("%d %d",&sr,&er); 
     int k=0; 
     for(j=0;j<n;j++) 
     { 
       if(a[j]>=sr && a[j]<=er) 
       { 
         ba[i][k]=a[j]; 
         k++; 
         bs[i]++; 
      } 
    } 
   } 
    
   for(i=0;i<b;i++) 
   { 
     insertion(ba[i],bs[i]); 
   } 
    
  printf("printing after sorting:"); 
    
   for(i=0;i<b;i++) 
   { 
     for(j=0;j<bs[i];j++) 
     { 
       printf("%d,",ba[i][j]); 
    } 
    //printf("\n"); 
   } 
 
} 
void insertion(int a[],int n) 
{ 
   
  int temp,i,j; 
   
   
  for(i=1;i<n;i++) 
  { 
    temp=a[i]; 
    j=i-1; 
     
    while(j>=0 && temp<=a[j]) 
    { 
      a[j+1]=a[j]; 
      j=j-1; 
    } 
    a[j+1]=temp; 
  } 
}

// double ll
#include<stdio.h>
#include<stdlib.h>

struct node{
  struct node *left;
  int data;
  struct node *right;
}*start=NULL,*curr;

void create(int ele){
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=ele;
  newnode->left=NULL;
  newnode->right=NULL;
  if(start==NULL)
    start = newnode;
  else
  {
    newnode->left=curr;
    curr->right=newnode;
  }
  curr=newnode;
}

void display_f(){
  struct node *temp;
  temp=start;
  while(temp!=NULL){
    printf("%d ",temp->data);
    temp=temp->right;
  }
}

void display_b()
{
  struct node *temp;
  temp=curr;
  while(temp!=NULL){
    printf("%d ",temp->data);
    temp=temp->left;
  }
}

void insert_at_begin(int ele){
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=ele;
  newnode->left=NULL;
  newnode->right=start;
  start->left=newnode;
  start=newnode;
}

void insert_at_end(int ele){
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=ele;
  newnode->right=NULL;
  newnode->left=curr;
  curr->right=newnode;
  curr=newnode;
}

void insert_at_position(int ele,int pos){
  struct node *newnode;
  newnode=(struct node*)malloc(sizeof(struct node));
  struct node *temp,*prev;
  temp=start;
  int i=1;
  newnode->data=ele;
  while(temp!=NULL)
  {
    if(i==pos)
  {
      //i++;
      break;
    }
    else
  {
      prev=temp;
      temp=temp->right;
      i++;
    }
  }
  newnode->left=prev;
  prev->right=newnode;
  newnode->right=temp;
  temp->left=newnode;
}

void delet_at_begin(){
  struct node *temp;
  temp=start;  
  start=start->right;
  start->left=NULL;
  free(temp);
}

void delet_at_end(){
  struct node *temp;
  temp=curr;
  curr=curr->left;
  curr->right=NULL;
  free(temp);  
}

void delet_by_position(int pos){
  struct node *temp,*prev;
  temp=start;
  int i=1;
  while(temp!=NULL){
    if(i==pos)
    break;
    else{
      prev=temp;
      temp=temp->right;
      i++;
    }
  }  
  prev->right=temp->right;
  temp->right->left=prev;
  temp->right=NULL;
  temp->left=NULL;
  free(temp);
}

void search(int ele){
  struct node *temp;
  temp=start;
  int i=1,c=0;
  while(temp!=NULL){
    if(temp->data==ele)
    {
      c=1;
      break;
    }
    else{
      i++;
      temp=temp->right;
    }
  }  
  if(c==0)
  printf("%d is not present in the LL\n",ele);
  else
  printf("%d found at %d position and %d index\n",ele,i,i-1);
}

void max(){
  int max=0;
  if(start ==NULL)
  printf("DOUBLY LINKED LIST is Empty\n");
  struct node *temp;
  temp=start;
  while(temp!=NULL){
    if(temp->data > max)
    max=temp->data;
    temp=temp->right;
  }  
  printf("Maximum element in the LL is :%d\n",max);
}

void min(){
  if(start ==NULL)
  printf("DOUBLY LINKED LIST is Empty\n");
  struct node *temp;
  temp=start;
  int max=temp->data;
  while(temp!=NULL){
    if(temp->data < max)
    max=temp->data;
    temp=temp->right;
  }  
  printf("Minimum element in the LL is :%d\n",max);
}

void count(){
  if(start ==NULL)
  printf("DOUBLY LINKED LIST is Empty\n");
  struct node *temp;
  temp=start;
  int c=0;
  while(temp!=NULL){
    c++;
    temp=temp->right;
  }
  printf("No.of nodes in the LL is:%d\n",c);
}

void sort(){
  struct node *temp=start,*temp1=start;
  int x;  
  while(temp!=NULL)
  {
    while(temp1->right!=NULL){
      if(temp1->data > temp1->right->data){
        x=temp1->data;
        temp1->data=temp1->right->data;
        temp1->right->data=x;
      }
      temp1=temp1->right;
    }
    temp=temp->right;
    temp1=start;
  }
}
int main()
{
  int ele,cont,choice,pos,key;
  do{
    printf("1.create a node\n2.display forward\n3.display backward\n4.insert at begin\n5.insert at end\n6.insert by position\n7.delete at begin\n8.delete at end\n9.delete by position\n10.search of an element\n11.maximum element\n12.minimum element\n13.count of nodes\n14.sort\n");
    scanf("%d",&choice);
    switch(choice){
      case 1:
        printf("Enter the element: ");
        scanf("%d",&ele);
        create(ele);
        break;
      case 2:
        display_f();
        break;
      case 3:
        display_b();
        break;
      case 4:
        printf("Enter the element: ");
        scanf("%d",&ele);
        insert_at_begin(ele);
        break;
      case 5:
        printf("Enter the element: ");
        scanf("%d",&ele);
        insert_at_end(ele);
        break;
      case 6:
        printf("Enter the element: ");
        scanf("%d",&ele);
        printf("Enter the position of the element to be inserted at: ");
        scanf("%d",&pos);
        insert_at_position(ele,pos);
        break;
      case 7:
        delet_at_begin();
        break;
      case 8:
        delet_at_end();
        break;
      case 9:
        printf("Enter the position: ");
        scanf("%d",&pos);
        delet_by_position(pos);
        break;
      case 10:
        printf("Enter the element to be searched: ");
        scanf("%d",&ele);
        search(ele);
        break;
      case 11:
        max();
        break;
      case 12:
        min();
        break;
      case 13:
        count();
        break;
      case 14:
        sort();
        break;
      }
      printf("Enter 1 continue or other number to exit:");
    scanf("%d",&cont);
  }while(cont==1);
}