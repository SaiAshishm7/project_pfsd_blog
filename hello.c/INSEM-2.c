// LINEAR PROBING

#include<stdio.h>
int tsize;
int hash(int data)
{
  int i;
  i=data%tsize;
  return i;
}
int li_pr(int index)
{
  int i;
  i=(index+1)%tsize;
  return i;
}
void main()
{
  int i,n,j,key;
  printf("Enter the table size:");
  scanf("%d",&tsize);
  
  printf("Enter no. of data:");
  scanf("%d",&n);
  
  int a[n],ht[tsize];
  printf("Enter the data:");
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  
  for(i=0;i<tsize;i++)
  {
    ht[i]=-1;
  }
  
  for(j=0;j<n;j++)
  {
    key=a[j];
    i=hash(key);
    while(ht[i]!=-1)
    {
      i=li_pr(i);
    }
    ht[i]=key;
  }
   printf("The datas are:");
   for(i=0;i<tsize;i++)
   {
     printf("\nElement at position %d: %d",i,ht[i]);
   }
  
}

//SEPERATE CHAINING

#include<stdio.h>
#include<stdlib.h>
#define size 10

struct node
{
  int data;
  struct node *next;
};

struct node *chain[size];

void insert(int value)
{
  struct node *n= malloc(sizeof(struct node));
  n->data=value;
  n->next=NULL;
  
  int key=value%size;
  
  if(chain[key]==NULL)
  {
    chain[key]=n;
  }
  else
  {
    struct node *temp=chain[key];
    while(temp->next!=NULL)
    {
      temp = temp->next;
    }
    temp->next=n;
  }
}

void print()
{
    int i;
    for(i = 0; i < size; i++)
    {
        struct node *temp = chain[i];
        printf("chain[%d]-->",i);
        while(temp)
        {
            printf("%d -->",temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

void main()
{
  int n,i;
  for(i=0;i<size;i++)
  {
    chain[i]=NULL;
  }
  
  int x,ch;
    do
    {
      printf("enter data:");
      scanf("%d",&x);
      insert(x);
      printf("Hash table data:");
      print();
      printf("\ndo you want to insert next data press 1 to continue 0 to stop:");
      scanf("%d",&ch);
  }while(ch!=0);
  
}

//BINARY SEARCH TREE

#include<stdio.h>
#include<stdlib.h>

struct node{
  struct node *left;
  int data;
  struct node *right;
}*root=NULL;

void insert(struct node *temp, struct node *nn);
struct node *getMin(struct node *temp);

void create(int c){
  struct node *newnode;
  newnode=(struct node *)malloc(sizeof(struct node));
  newnode->data=c;
  newnode->left=NULL;
  newnode->right=NULL;
  if(root==NULL)
  root=newnode;
  else
  insert(root,newnode);
}

void insert(struct node *temp,struct node *nn)
{
    if(nn->data>=temp->data)
    {
        if(temp->right==NULL)
        temp->right=nn;
        else
        insert(temp->right,nn);
    }
        
    if(nn->data<temp->data)
    {
        if(temp->left==NULL)
        temp->left=nn;
        else
        insert(temp->left,nn);
    }
}

void binary_search(struct node *temp,int key)
{
    if(key==temp->data)
        printf("Element found");
    if(key>temp->data)
    {
        if(temp->right==NULL)
        printf("Element not found");
        else
        binary_search(temp->right,key);
    }
    if(key<temp->data)
    {
        if(temp->left==NULL)
        printf("Element not found");
        else
        binary_search(temp->left,key);
    }
}

void min(struct node *temp){
    while(temp->left!=NULL)
        temp=temp->left;
    printf("min value in the tree is %d",temp->data);
}

void max(struct node *temp){
    while(temp->right!=NULL)
        temp=temp->right;
    printf("max value in the tree is %d",temp->data);
}

void inorder(struct node *temp){
  if(temp!=NULL)
  {
    inorder(temp->left);
    printf("%d ",temp->data);
    inorder(temp->right);
  }
}

void preorde(struct node *temp)
{
  if(temp!=NULL)
  {
    printf("%d ",temp->data);
    preorde(temp->left);
    preorde(temp->right);
  }
}

void postorde(struct node *temp)
{
  if(temp!=NULL)
  {
    postorde(temp->left);
    postorde(temp->right);
    printf("%d ",temp->data);
  }
}

void delet_node(struct node *root,int key){
  struct node *parent=NULL,*curr=root;
  while(curr!=NULL && curr->data!=key){
    parent=curr;
    if(key < curr->data)
    curr=curr->left;
    else
    curr=curr->right;
  }
  if(curr==NULL)//unsuccessful search for the key
  return;
  //case1 (deleting a leaf node(with no children or deg==0))
  if(curr->left==NULL && curr->right==NULL){
    if(curr!=root){
      if(parent->left==curr)
      parent->left=NULL;
      else
      parent->right=NULL;
    }
    else
    root=NULL;
    free(curr);
  }
  //case 2 (node having two children)
  else if(curr->left!=NULL && curr->right!=NULL){
    struct node *successor=getMin(curr->right);
    int d=successor->data;
    delet_node(root,successor->data);
    curr->data=d;
  }
  //case 3 (node with single child)
  else{
    struct node *child=(curr->left!=NULL)?curr->left:curr->right;
    if(curr!=root){
      if(parent->left==curr)
      parent->left=child;
      else
      parent->right=child;
    }
    else
    root=child;
    free(curr);
  }
}

struct node *getMin(struct node *temp){
  while(temp->left!=NULL){
    temp=temp->left;
  }
  return temp;
}

void main(){
  int data;
  int ch,cont,key;
  do{
  printf("Enter your choice: ");
  printf("\n1.create\n2.inorder display\n3.preorder display\n4.postorder display\n5.Binary search\n6.Minimum\n7.Maximum\n8.delete node\n");
  scanf("%d",&ch);
  switch(ch){
    case 1:
        printf("Enter your data: ");
        scanf(" %d",&data);
        create(data);
        break;
    case 2:
        inorder(root);
        break;
    case 3:
        preorde(root);
        break;
    case 4:
        postorde(root);
        break;
    case 5:
        printf("Enter key element");
        scanf("%d",&key);
        binary_search(root,key);
    break;
    case 6:
        min(root);
    break;
    case 7:
        max(root);
    break;
  case 8:
    printf("Enter the data to be deleted: ");
    scanf("%d",&data);
    delet_node(root,data);
    break;
  }
  printf("Enter 1 to continue, 0 to exit\n");
  scanf("%d",&cont);
}while(cont==1);

}

// HEAP SORT

#include<stdio.h>

void heapsort(int arr[],int n);
void heapify(int arr[],int n,int i);
void swap(int *a,int *b);

void heapsort(int arr[],int n){
  int i;
  //constructing max heap
  for(i=(n/2-1);i>=0;i--)
    heapify(arr,n,i);
    
  for(i=n-1;i>=0;i--)
  {
    swap(&arr[0],&arr[i]);
    heapify(arr,i,0);
  }
}

void heapify(int arr[],int n,int i){
  int large=i;
  int left=2*i+1;
  int right=2*i+2;
  if(left<n && arr[left] > arr[large])
  large=left;
  if(right<n && arr[right] > arr[large])
  large=right;
  if(large!=i){
    swap(&arr[i],&arr[large]);
    heapify(arr,n,large);
  }
}

void swap(int *a,int *b){
  int temp;
  temp=*a;
  *a=*b;
  *b=temp;
}

void main(){
  int n;
  printf("Enter the size of array: ");
  scanf("%d",&n);
  int arr[n],i;
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
  heapsort(arr,n);
  printf("Array after sorting: ");
  for(i=0;i<n;i++)
  printf("%d ",arr[i]);
}

//EXPRESSION TREE

#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
struct node
{
  struct node *left;
  char data;
  struct node *right;
}*stack[30];

int top=-1;

void push(struct node *c){
  stack[++top]=c;
}

struct node *pop(){
  return stack[top--];
}

void Inorder(struct node *temp){
  if(temp!=NULL){
    Inorder(temp->left);
    printf("%c",temp->data);
    Inorder(temp->right);
  }
}

void main()
{
  char exp[20];
  printf("Enter the postix Expression: ");
  scanf("%s",exp);
  int i;
  for(i=0;exp[i]!='\0';i++)
  {
    if(isalpha(exp[i]))
  {
      struct node *newnode;
      newnode=(struct node*)malloc(sizeof(struct node));
      newnode->left=NULL;
      newnode->data=exp[i];
      newnode->right=NULL;
      push(newnode);
    }
    else if(exp[i]=='-'||exp[i]=='+'||exp[i]=='*'||exp[i]=='/'||exp[i]=='^')
  {
      struct node *ptr1,*ptr2;
      ptr1=pop();
      ptr2=pop();
      struct node *newnode;
      newnode=(struct node*)malloc(sizeof(struct node));
      newnode->data=exp[i];
      newnode->right=ptr1;
      newnode->left=ptr2;
      push(newnode);
    }
  }
  Inorder(stack[0]);
}

// BFS
#include<stdio.h>
int a[20][20],q[20],visited[20],n,f=-1,r=-1;
void bfs(int v) 
{
       int i;
       for (i=0;i<n;i++)                                // check all the vertices in the graph
       {
               if(a[v][i] != 0 && visited[i] == 0) // adjacent to v and not visited
              {
                       r=r+1;
                       q[r]=i;                       // insert them into queue
                       visited[i]=1;          // mark the vertex visited
                       //printf("%d  ",i);
              }
      }
      printf("%d   ",q[f]);
      f=f+1;                             // remove the vertex at front of the queue
      if(f<=r)                           // as long as there are elements in the queue
            bfs(q[f]);                  // peform bfs again on the vertex at front of the queue
}
int main()
{
    int v,i,j;
    printf("\n Enter the number of vertices:");
    scanf("%d",&n);
    
    for (i=0;i<n;i++)                   // mark all the vertices as not visited
    {
        visited[i]=0;
    }
    
    printf("\n Enter graph data in matrix form:\n");
    for (i=0;i<n;i++)
      for (j=0;j<n;j++)
       scanf("%d",&a[i][j]);
       
    printf("\n Enter the starting vertex:");
    scanf("%d",&v);
    
    f=r=0;
    q[r]=v;
    printf("\n BFS traversal is:\n");
    visited[v]=1;                                     // mark the starting vertex as visited
    //printf("%d   ",v);
    bfs(v);
    if(r != n-1)
        printf("\n BFS is not possible");
}

//DFS

#include<stdio.h>
 
void DFS(int);
int G[10][10],visited[10],n;    //n is no of vertices and graph is sorted in array G[10][10]
void main()
{
    int i,j,s;
    printf("Enter number of vertices:");
    scanf("%d",&n);
    
    //read the adjecency matrix
  printf("\nEnter adjecency matrix of the graph:");    
  for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      scanf("%d",&G[i][j]);
      
    //visited is initialized to zero
   for(i=0;i<n;i++)
        visited[i]=0;
        
  printf("enter sourse vertex ");
  scanf("%d",&s);
    DFS(s);
}
void DFS(int i)
{
    int j;
  printf("\n%d",i);
    visited[i]=1;
  for(j=0;j<n;j++)
  {
    if(!visited[j]&&G[i][j]==1)
           DFS(j);
  }
}