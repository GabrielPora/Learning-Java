/*NOTE TO COMPLIE*/
/*  gcc main.c  */

// Goal create a simple C program to show how linked list works
#include<stdio.h>
#include<stdlib.h>

// best practice struct should be in their own hedder file 
// but for ease of use. I put it into this file
typedef struct Node
{
    int value;
    struct Node *next;
}               t_node;

// This is to print through the array
void printList(t_node *n)
{
  while (n != NULL)
  {
    printf(" %d ",n->value);
    n = n->next;
  }
}

// This is to create and inilize the Node
t_node* newList(int item)
{
  t_node* head = NULL; // we need to declear head and assign it NULL otherwise we are given random memory sector as a value
  head = (t_node*)malloc(sizeof(t_node)); // Now we have to assign memory for it to the size of the (struct Node) Node
  head->value = item; // assign value in the head node
  head->next = NULL; // have to add null so we can stop on null condition and it good house keeping
  return (head);
}

// To add node before head and make newNode the new head
void prepend(t_node** head, int value)
{
  t_node* newHead = NULL; // remember to declear it first
  newHead = (t_node*)malloc(sizeof(t_node)); // remember to give it memory 
  newHead->value = value;
  newHead->next = *head;
  *head = newHead;
}

// This is to get the size of the Node
int lengthOfList(t_node* head)
{
  int count = 0;
  t_node* tmp = NULL; // remember to declear it first
  tmp = head;
  while (tmp != NULL)
  {
    count ++;
    tmp = tmp->next;
  }
  return count;
}

/*  Extra Fun Stuff */

// To add node to end of list
void append(t_node* head, int value)
{
  t_node* newHead = NULL; // remember to declear it first
  newHead = (t_node*)malloc(sizeof(t_node)); // remember to give it memory 
  while (head->next != NULL) // This is to find the last node in the list
  {
    head = head->next;
  }
  head->next = newHead; // add the new node to end of the last node
  newHead->value = value; // add the value to the new node
  newHead->next = NULL; // make sure that the new node points to NULL and this now becomes the new end node
}

// This is the main for the program
int main(int argc, char **argv)
{
  int size = 0;
  t_node* list = newList(10); // This method creates the list and adds 10 to the value
  prepend(&list, 5); // This method will prepend the value to the list and add a new node to the front of the node
  prepend(&list, 21);
  /* uncommet below code to apply append */
  // append(list, 8);
  // append(list, 2);
  // append(list, 92);
  printList(list); // will print out the list
  size = lengthOfList(list);  // will get the length of the list
  printf(" size %i \n ", size);
  return 0;
}
