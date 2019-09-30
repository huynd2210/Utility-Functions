public static String swap(String str, String one, String two){
	    return Arrays.stream(str.split(one, -1))
	            .map(s -> s.replaceAll(two, one))
	            .collect(Collectors.joining(two));
              }
//Note: Input a string, a substring and a replacement string         
