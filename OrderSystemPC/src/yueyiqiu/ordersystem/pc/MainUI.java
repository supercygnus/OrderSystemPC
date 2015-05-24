package yueyiqiu.ordersystem.pc;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import yueyiqiu.ordersystem.pc.Constant;

public class MainUI extends JFrame{
	
	
	public int screenHeight;
	public int screenWidth;
	
	
	DefaultTreeModel dtm=new DefaultTreeModel(Constant.root);
	JTree jt=new JTree(dtm);
	
	public MainUI(){
		this.getScreen();
		this.createTree();
		
		//jt.setCellRenderer(new );
		
	}
	
	
	public void getScreen(){
		
	}
	
	
	public void createTree(){
		
		for(int i=0;i<Constant.dmtn.length;i++){
			dtm.insertNodeInto(Constant.dmtn[i], Constant.root, i);
		}
		
	}
	
	public static void main(String[] args) {
		
		int a=10;
		
		//System.out.println(a/0);
		MainUI hh=null;
		System.out.println(hh.toString());
	}

}
