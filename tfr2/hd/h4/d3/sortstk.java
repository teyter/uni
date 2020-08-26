public class sortstk {
public void sortstk( Stack s )
{
    Stack<Integer> temp = new Stack<Integer>();

    while( !s.isEmpty() )
    {
    int s1 = (int) s.pop();

    while( !temp.isEmpty() && (temp.peek() > s1) )
    {
        s.push( temp.pop() );
    }
    temp.push( s1 );

                                                    }

    // Print the entire sorted stack from temp stack
    for( int i = 0; i < temp.size(); i++ )
    {
    System.out.println( temp.elementAt( i ) );
    }
                
    }
}
