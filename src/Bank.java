import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        branches = new ArrayList<Branch>();
    }

    public void AddBranch (Branch branch) {
        this.branches.add(branch);
    }

    public void ShowAllBranches () {
        for (int i = 0; i < branches.size(); i ++) {
            System.out.println("Branch " + branches.get(i).getBranchName());
        }
    }
}
