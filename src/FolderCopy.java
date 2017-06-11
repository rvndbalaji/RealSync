import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
 

public class FolderCopy
{

  
    public double Srcsize=0;
    public double Dessize=0;

     public int getProgress()
    {
        int val  = (int)(Srcsize/Dessize)*100;           
        return val;
    }
    
     
     public static long getFolderSize(File dir) {
    long size = 0;
    for (File file : dir.listFiles()) {
        if (file.isFile()) 
        {            
            size += file.length();
        }
        else
        {
            size += getFolderSize(file);
        }
    }
    return size;
}
     
     
    public int BeginCopy(String S,String D)
    {	
    	File srcFolder = new File(S);
    	File destFolder = new File(D);
        //Srcsize = getFolderSize(srcFolder);
        
       
        
        
    	//make sure source exists
    	if(!srcFolder.exists())
        {
 
           JOptionPane.showMessageDialog(null,"The source folder does not exist!");
       
           //just exit
           return 0;
 
        }else
        {
             
           try
           {
               destFolder.mkdirs();
               
        	copyFolder(srcFolder,destFolder);
                
           }catch(IOException e)
           {
         JOptionPane.showMessageDialog(null,"The following error occured : \n "+e.getMessage());
        	//error, just exit
     
                return 0;
           }
        }
           return 1;
    	//JOptionPane.showMessageDialog(null,"Folder Synchronized");
    }
 
    
    
    
    
    
    public void copyFolder(File src, File dest)
    	throws IOException
    {
 
      
        
    	if(src.isDirectory()){
 
    		//if directory not exists, create it
    		if(!dest.exists()){
                    
    		   dest.mkdir();
    		   
    		}
 
    		//list all the directory contents
    		String files[] = src.list();
                
                
    		for (String file : files)
                {
    		   //construct the src and dest file structure
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   //recursive copy
    		   copyFolder(srcFile,destFile);
                    
    		}
 
    	}else{
    		//if file, then copy it
    		//Use bytes stream to support all file types
    		InputStream in = new FileInputStream(src);
    	        OutputStream out = new FileOutputStream(dest); 
 
    	        byte[] buffer = new byte[1024];
 
    	        int length;
    	        //copy the file content in bytes 
    	        while ((length = in.read(buffer)) > 0)
                {
    	    	   out.write(buffer, 0, length);
                   
    	        }
 
    	        in.close();
    	        out.close();
              // Dessize = getFolderSize(dest);
              
                //call.pbar.setValue(getProgress());
                  
    	}
      
    }
}