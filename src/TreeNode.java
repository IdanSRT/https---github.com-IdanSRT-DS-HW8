
public class TreeNode {
	
	double mKey;
	TreeNode mLeft;
	TreeNode mRight;
	TreeNode mParent;
	int mSize;
	int mHight;
	
	public TreeNode(double iKey){
		this.mKey = iKey;
	}

	public double getmKey() {
		return mKey;
	}

	public void setmKey(double mKey) {
		this.mKey = mKey;
	}

	public TreeNode getmLeft() {
		return mLeft;
	}

	public void setmLeft(TreeNode mLeft) {
		this.mLeft = mLeft;
	}

	public TreeNode getmRight() {
		return mRight;
	}

	public void setmRight(TreeNode mRight) {
		this.mRight = mRight;
	}

	public TreeNode getmParent() {
		return mParent;
	}

	public void setmParent(TreeNode mParent) {
		this.mParent = mParent;
	}

	public int getmSize() {
		return mSize;
	}

	public void setmSize(int mSize) {
		this.mSize = mSize;
	}

	public int getmHight() {
		return mHight;
	}

	public void setmHight(int mHight) {
		this.mHight = mHight;
	}
	
	
}
