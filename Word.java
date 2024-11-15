public class Word {
    
     LinkedList<Integer> Id_doc = new LinkedList<Integer>() ;
     String word ;

    public Word(  LinkedList<Integer> docsID,String word) {
        Id_doc = docsID ;
        this.word = word;
    }
     
    public boolean isExist(int id) {
        if (Id_doc.empty())
            return false ;
        
        Id_doc.findfirst();
            while (! Id_doc.last())
            {
                if (Id_doc.retrieve().equals(id))
                    return true ;
                
             Id_doc.findnext();
            }
            // for the last node
            if (Id_doc.retrieve().equals(id))
                  return true ;  
            
        return false ;    
    }
    
    
    public void insertID(int id) {
        
        if (! isExist(id))
            Id_doc.insert(id);
    }
    
}
