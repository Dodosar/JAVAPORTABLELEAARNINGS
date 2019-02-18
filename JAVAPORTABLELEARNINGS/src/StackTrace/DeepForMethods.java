package StackTrace;

public class DeepForMethods {
    public static void main(String[] args) throws Exception {
    	method1();
    }
    
    private static void method1() {
		// TODO Auto-generated method stub
    	int deep = getStackTraceDeep();
	}

    public static int getStackTraceDeep() {
        //�������� ��� ��� ���
    	
    	StackTraceElement[] stack = Thread.currentThread().getStackTrace();
    	int deepTrace = stack.length;
    	System.out.println(deepTrace); 
    	return deepTrace;
    }
}

/*��� �������� ���������� ��� ����-����� 
 * http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Thread.html#getStackTrace() 
 * Returns an array of stack trace elements representing the stack dump of this thread. 
 * This method will return a zero-length array if this thread has not started or has terminated.
 * If the returned array is of non-zero length then the first element of the array represents the top of the stack, which is the most recent method invocation in the sequence. 
 * The last element of the array represents the bottom of the stack, which is the least recent method invocation in the sequence.
 * Returns: an array of StackTraceElement, each represents one stack frame.
 * �� ���� ���������� ������ ���������, ������ �� ������� ������������ ���� ����.
 * ����� ������ stackTraceElements.length;
 * ��� ����� �������� �� ��� ����������� ������ ������ ������ � �������, � ��� ����� (�.�. ����������) ������� � ����� �������.
 */