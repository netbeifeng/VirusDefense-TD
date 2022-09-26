package Unit;

public enum RouteUnit {
	FST("First", 1), SND("Second",2), TRD("Third",3), FTH("Fourth", 4);
	
	private String name;  
	private int index;  
  
	private RouteUnit(String name, int index) {  
        this.name = name;  
        this.index = index;  
	}  

    public static String getName(int index) {  
        for (RouteUnit r : RouteUnit.values()) {  
            if (r.getIndex() == index) {  
                return r.name;  
            }  
        }  
        return null;  
    }  

    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    } 
    
    
	
}
