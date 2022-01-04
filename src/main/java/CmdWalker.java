public class CmdWalker extends hello_cmd_grammerBaseListener{

    public void enterPrule(hello_cmd_grammerParser.PruleContext prule) {
        System.out.println("this is prule : " + prule.children.toString());
    }

    public void exitPrule(hello_cmd_grammerParser.PruleContext prule) {
        System.out.println("Exiting prule!");
    }

}
