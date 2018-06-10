public static String sortByString(String s, String t) {
		String u = "";
		for(int i = 0; i < t.length(); i++){
	        for(int j = 0; j < s.length(); j++){
	        	char c = t.charAt(i);
	        	char d = s.charAt(j);
	            if(c == d) {
	            	u += d;
	            }
	        }
	    }
	    return u;
}