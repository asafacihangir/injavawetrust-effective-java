package chapter04.item19;

public class Item19Notes {

	// #####
	// Item 19 - Design and document for inheritance or else prohibit it

	// The class must document its self-use of overridable methods.
	// For each public or protected method , the documentation must indiate which
	// overridable methods the method invokes , in what sequence
	// and how the results of each invocation affect subsequent processing.

	// A method that invokes overridable methods contains a description of these
	// invocations at the end of its documentation comment.

	// The description is in a special section of the specification , labeled ,
	// "Implementation Requirements"
	// which is generated by the Javadoc tag @implSpec

	// java.util.AbstractCollection

	/**
	 * {@inheritDoc}
	 *
	 * @implSpec This implementation iterates over the collection looking for the
	 *           specified element. If it finds the element, it removes the element
	 *           from the collection using the iterator's remove method.
	 *
	 *           <p>
	 *           Note that this implementation throws an
	 *           {@code UnsupportedOperationException} if the iterator returned by
	 *           this collection's iterator method does not implement the
	 *           {@code remove} method and this collection contains the specified
	 *           object.
	 *
	 * @throws UnsupportedOperationException {@inheritDoc}
	 * @throws ClassCastException            {@inheritDoc}
	 * @throws NullPointerException          {@inheritDoc}
	 */
	// public boolean remove(Object o) { ...}

	// The documentation leaves no doubt that overriding the iterator method will
	// affect the behavior of the remove method.
	//
	// To document a class so that it can be safely subclassed , you must describe
	// implementation details that should otherwise be left unspecified
	// @implSpec tag was added in Java 8 and used heavily in Java 9.

	// ###
	// A class may have to provide hooks into its internal workings in the form of
	// judiciously chosen protected methods or ,in rare instances , protected
	// fields.
	// For example , consider removeRange method from java.util.AbstractList
	// protected void removeRange(int fromIndex, int toIndex) {

	// This method is of no interest to end users of a List implementation.
	//

	// How do you decide what protected members to expose when you design a class
	// for inheritance ?
	// Unfortunately , there is no magic bullet.
	// The best you can do is to think hard, take your best guess, and then test it
	// by writing subclasses.

	// The only way to test a class designed for inheritance is to write subclasses.
	// if several subclasses are written and none uses a protected member , you
	// should probably make it private.
	// Experience shows that three subclasses are usually sufficient to test an
	// extendable class.
	// One or more of these subclasses should be written by someone other than the
	// superclass author.

	// You must test your class by writing subclasses before you release it.

	// There are a few more restrictions that a class must obey to allow inheritance
	// Constructors must not invoke overridable methods , directly or indirectly.
	// if you violate this rule , program failure will result.
	// The superclass constructor runs before the subclass constructor , so the
	// overriding method in the subclass will get invoked before subclass
	// constructor has run

	// if the overriding method depends on any initialization performed by the
	// subclass constructor , the method will not behave as expected.

	// Note that it is safe to invoke private methods , final methods , and static
	// methods , none of which are overridable , from a constructor.

	// The Cloneable and Serializable interfaces present special difficulties when
	// designing for inheritance.
	// It is generally not a good idea for a class designed for inheritance to
	// implement either of these interfaces because they place a substantial burden
	// on programmers who extend the class.

	// if you do decide to implement either Cloneable or Serializable in a class
	// that is designed for inheritance , you should be aware that because the clone
	// and readObject methods behave a lot like constructors

	// neither clone nor readObject may invoke an overridable method , directly or
	// indirectly.

	// In the case of readObject , the overriding method will run before the
	// subclass's state has been deserialized.
	// In the case of clone , the overriding method will run before the subclass's
	// cline method has a chance to fix the clone's state.

	// Designing a class for inheritance requires great effort and places
	// substantial limitations on the class.

	// There are some situations where it is clearly the right thing to do , such as
	// abstract classes , including skeletal implementations of interfaces (Item 20)

	// The best solution to this problem is to prohibit subclassing in classes that
	// are not designed and documented to be safely subclassed

	// There are two ways to prohibit subclassing.
	// - declare the class final
	// - make all constructors private

	// In summary , designing a class for inheritance is hard work. You must
	// document all of its self-use patterns, and once you have documented them you
	// must commit to them for lthe life of the class

	// if you fail to do this , subclass may become dependent on implementation
	// details of the superclass and may break
	// if the implementation of the superclass changes.
	// To allow others to write efficient subclasses you may also have to export one
	// or more protected methods.

	// Unless you know there is a real need for subclasses you are probably better
	// off prohibiting inheritance by declaring your class final or ensuring thaat
	// there are no accessible constructors

}
