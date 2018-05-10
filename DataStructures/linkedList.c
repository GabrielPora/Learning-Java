// Goal create a simple C program to show how linked list works
#include<stdio.h>
#include<stdlib.h>
#include "node.h"

void printList(struct Node *n)
{
  while (n != NULL)
  {
    printf(" %d ",n->value);
    n = n->next;
  }
}

// Create a simple linked list with 3 nodes
int main()
{
  struct Node* head = NULL;
  struct Node* second = NULL;
  struct Node* third = NULL;

  // allocate memory for the 3 nodes on the heap
  head = (struct Node*)malloc(sizeof(struct Node));
  second = (struct Node*)malloc(sizeof(struct Node));
  third = (struct Node*)malloc(sizeof(struct Node));

  head->value = 1; // assign value in the first node
  head->next = second; // Link first node with the second node

  second->value = 2; // assign value in the second node
  second->next = third; // Link second node with the third node

  third->value = 3; // assign value in the third node
  third->next = NULL; // have to add null so we can stop on null condition 

  printList(head);
  printf("\n ");

  return 0;
}
