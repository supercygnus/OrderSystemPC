package yueyiqiu.ordersystem.pc;

import javax.swing.tree.DefaultMutableTreeNode;

public class Constant {
	
	public static DefaultMutableTreeNode root=new DefaultMutableTreeNode("點菜系統");
	public static DefaultMutableTreeNode[] dmtn=new DefaultMutableTreeNode[]{
		new DefaultMutableTreeNode("食譜管理"),new DefaultMutableTreeNode("餐位管理"),new DefaultMutableTreeNode("員工管理")
		,new DefaultMutableTreeNode("訂單管理"),new DefaultMutableTreeNode("結算管理")
	};
	
	//食譜管理子節點
	public static DefaultMutableTreeNode[] vegenodes=new DefaultMutableTreeNode[]{
		
		
	};
	
	
	//員工管理子節點
		public static DefaultMutableTreeNode[] empnodes=new DefaultMutableTreeNode[]{
			
			
		};
		
	//員工管理子節點
//		public static DefaultMutableTreeNode[] empnodes=new DefaultMutableTreeNode[]{
//			
//			
//		};
}
