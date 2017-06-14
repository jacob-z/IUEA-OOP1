/******************************************************************************/
/* This file was created by Thomas Gwozdz for use at the International        */
/* University of East Africa in Kampala, Uganda.  It may be used as study     */
/* material for private individuals or with permission in an educational      */
/* setting.  Contact the creator at tg0640@gmail.com                          */
/******************************************************************************/
/* Name:                                                                      */
/* OOP1 Section:                                                              */
/******************************************************************************/
/* This is a diagnostic test designed to see how well you have learned the    */
/* concepts in the 10th and 11th weeks of OOP1.  THIS IS NOT FOR A GRADE, but */
/* it MUST be completed.  Try to complete each task to the best of your       */
/* ability but if you cannot figure something out, please move on quickly.    */
/******************************************************************************/



public class Modifier {

    // In Java, modifiers are keywords that allow you to change definition
    // meanings. There are access modifiers and non-access modifiers.

    // Access modifiers (private, public, protected) allow you to decide
    // the scope of the visibility of the definition.

    // By default, definitions (of variables, classes, methods, etc.) are
    // only visible to the packages they are in.

    // The private modifier makes the definition only visible to the class.
    private boolean myFlag;

    // The public modifier makes the definition visible to the world.
    public double version = 2.1;

    // The protected modifier makes the definition visible to the package
    // and all subclasses.
    protected static final int NUM_METHODS = 3;

    // Non-access modifiers (static, final, abstract, synchronized, volatile)
    // provide other functionality. When coding, you will most often utilize
    // and see the keywords static and final. Abstract allows for creation of
    // abstract classes and methods. Synchronized and volatile are used for
    // threads.

    // The static modifier means that the definition is shared between all
    // instances of the object. In this case, all objects of type Modifier
    // would be able to see number_of_modifiers, which is 8.
    // The final modifier means that the definition can only be initialized 
    // once. For example, a variable of type final int cannot be incremented.
    public static final int number_of_modifiers = 8;

    public static int staticbutnotfinal = 2;

    public String objname = "";

    /*** YOUR CODE HERE ***/ // see below for details


    public static void main(String[] args) {

        System.out.println("Welcome to modifiers!");

        // In fact, the compiler won't even let you assign a value to
        // a final variable after it has one. Try commenting in the
        // line below and see what happens when you compile.

        // number_of_modifiers = 9;

        // A few Modifier objects to work with.
        Modifier mod1 = new Modifier();
        Modifier mod2 = new Modifier();

        // Here, we can see the static final variable is shared by all 
        // instances of the object.
        System.out.println("A static final variable: " + mod1.NUM_METHODS);
        System.out.println("A static final variable: " + mod2.NUM_METHODS);


        // Now, we can update a static but not final variable, and it will
        // change among all instances of the class. So really, the two
        // statements below are adding to the same variable.
        mod1.staticbutnotfinal += 1;
        mod2.staticbutnotfinal += 2;

        System.out.println("This should be 5: " + mod1.staticbutnotfinal);
        System.out.println("This should be 5: " + mod2.staticbutnotfinal);

        // We can also add to nonstatic variables, which will mean they are
        // separate among instances of the object and will be different values.
        mod1.objname += "This is mod1";
        mod2.objname += "This is mod2";

        System.out.println(mod1.objname);
        System.out.println(mod2.objname);

        // Try adding the keyword static in the declaration of objname above.
        // What does it do? Is that what you expect to happen?

        // Finally, try adding your own variables above main() using keywords
        // static, final or no keyword. Experiment with the different
        // keywords and their effect on the ability of the program to share
        // variables between instances of Modifier.

        /*** YOUR CODE HERE ***/

        }
    }