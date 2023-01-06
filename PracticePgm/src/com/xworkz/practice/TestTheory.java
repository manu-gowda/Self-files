public class TestRunner {
         
	        static class Test {
		 
		        int min;
		        int max;
		    }
		 
		    static Test getMinMax(int arr[], int low, int high)
		    {
		    	Test minmax = new Test();
		    	Test sss = new Test();
		    	Test sse = new Test();
		        int mid;
		 
		       
		        if (low == high) {
		            minmax.max = arr[low];
		            minmax.min = arr[low];
		            return minmax;
		        }
		 
		       
		        if (high == low + 1) {
		            if (arr[low] > arr[high]) {
		                minmax.max = arr[low];
		                minmax.min = arr[high];
		            }
		            else {
		                minmax.max = arr[high];
		                minmax.min = arr[low];
		            }
		            return minmax;
		        }
		 
		       
		        mid = (low + high) / 2;
		        sss = getMinMax(arr, low, mid);
		        sse = getMinMax(arr, mid + 1, high);
		 
		     
		        if (mml.min < mmr.min) {
		            minmax.min = mml.min;
		        }
		        else {
		            minmax.min = mmr.min;
		        }
		 
		       		        if (mml.max > mmr.max) {
		            minmax.max = mml.max;
		        }
		        else {
		            minmax.max = mmr.max;
		        }
		 
		        return minmax;
		    }
		 
		   		    public static void main(String args[])
		    {
		        int arr[] = { 2000, 12, 564, 23, 499,  };
		        int arr_size = 10;
		        Test minmax = getMinMax(arr, 0, arr_size - 1);
		        System.out.printf("\nMinimum element is %d",
		                          minmax.min);
		        System.out.printf("\nMaximum element is %d",
		                          minmax.max);
		    }
		
	

	}







3:Specialization:
Specialization is defined as the process of subclassing a superclass entity on the basis of some
 distinguishing characteristic of the entity in the superclass.The reason for creating such hierarchical
 relationship.
 
 Generalized:
Generalization is the bottom-up process of abstraction, where we club the differences among entities 
according to the common feature and generalize them into a single superclass. The original entities are 
thus subclasses of it. In more simple terms, it is just the reverse of specialization, which is a top-down 
process whereas generalization is bottom up.

4(a):To Stop a class extends inherited by other classes make class as const private.

(B):java.lang.math,java.lang.String and final classes.

(C):Delegation can be  alternative to inheritance. Delegation means that you use an object of another class 
as to instance variable.

5:If you just want to sort a list, use any kind of List and use Collections.sorted(). If you want to make sure
elements in the list are unique and always sorted.

6:arraylist:fixed size.
compile time memory allocation.
use less memory in linkedlist.
elements can be accseced easily.

LinkedList:Dynamic in size.
Run time memory alocation.
use more memory.
elements accseced required.


7:iterator:
Method is remove()
method returns to object iterator.
farward and remove.
java.util.

Listiterator:
remove(),add(),set().
method returns to object Listiterator.
java.util.

8:remove type casting return to subtype of the overridden method's based on  return type.


9:memory likeage in java is one instance pointing to reference to memory  is pointing to another memory location 
memory leakage like garbage collector.


10:static polymorphisam  call the method from  compile time 
dynomic polymorphisam call the method from  run time
 
 
11:all the properties private 
remove the type casting return a subtype of the overridden method's based on  return type


9:memory likeage in java is one instance pointing to reference to the memory  is pointing to another memory location 
memory leakage like garbage collector


10:static polymorphisam  call the method from  compile time 
dynomic polymorphisam call the method from  run time
 
 
 11: To achive encapsulation to all the properties private.



