       if ( s == null || s.isEmpty() ) return null;
       char[] k = s.toCharArray();
       String temp = String.valueOf( k[0] ).toUpperCase();
       k[0] = temp.charAt(0);
       int len = k.length;
       char space = ' ';
       String t;
       for (int i = 1; i < len; i++) {
           if (k[i-1] == space) {
               t = String.valueOf( k[i] ).toUpperCase();
               k[i] = t.charAt(0);
           }
       }
       return new String(k);
