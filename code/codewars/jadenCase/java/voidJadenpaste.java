        String space = " ";
        String p = String.valueOf( Smith.charAt(0) );
        System.out.print( p.toUpperCase() );
        for (int i = 1; i < Smith.length(); i++) {
            if ( String.valueOf(Smith.charAt(i-1)).equals(space) ) {
                String u = String.valueOf( Smith.charAt(i) );
                System.out.print( u.toUpperCase() );
            }
            else {
                System.out.print( Smith.charAt(i) );
            }
        }
        System.out.println();
