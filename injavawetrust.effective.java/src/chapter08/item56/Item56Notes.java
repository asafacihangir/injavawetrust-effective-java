package chapter08.item56;

public class Item56Notes {

	// #####
	// Item 56: Write doc comments for all exposed API elements

	// If an API is to be usable, it must be documented. Traditionally, API
	// documentation was generated manually, and keeping it in sync with code was a
	// chore

	// Javadoc generates API documentation automatically from source code with
	// specially formatted documentation comments, more commonly known as doc
	// comments.

	// While the doc comment conventions are not officially part of the language,
	// they constitute a de facto API that every Java programmer should know.

	// One important doc tag was added in Java 9, {@index}; one in Java 8,
	// {@implSpec}; and two in Java 5, {@literal} and {@code}. These tags are
	// missing from the aforementioned web page, but are discussed in this item.

	// To document your API properly, you must precede every exported class,
	// interface, constructor, method, and field declaration with a doc comment.

	// The doc comment for a method should describe succinctly the contract between
	// the method and its client.

	// the contract should say what the method does rather than how it does its job.
	// The doc comment should enumerate all of the method’s preconditions, which are
	// the things that have to be true in order
	// for a client to invoke it, and its postconditions, which are the things that
	// will be true after the invocation has completed successfully.

	// A side effect is an observable change in the state of the
	// system that is not obviously required in order to achieve the postcondition.

	/*
	 * To describe a method’s contract fully, the doc comment should have an
	 * 
	 * @param tag for every parameter, an @return tag unless the method has a void
	 * return type, and an @throws tag for every exception thrown by the method,
	 * whether checked or unchecked (Item 74).
	 */

	/*
	 * By convention, the text following an @param tag or @return tag should be a
	 * noun phrase describing the value represented by the parameter or return
	 * value.
	 */

	/*
	 * Notice the use of HTML tags in this doc comment (<p> and <i>). The Javadoc
	 * utility translates doc comments into HTML, and arbitrary HTML elements in doc
	 * comments end up in the resulting HTML document.
	 */

	/*
	 * when you design a class for inheritance, you must document its self-use
	 * patterns, so programmers know the semantics of overriding its methods.
	 * 
	 * These self-use patterns should be documented using the @implSpec tag, added
	 * in Java 8.
	 */

	/*
	 * Don’t forget that you must take special action to generate documentation that
	 * contains HTML metacharacters, such as the less-than sign (<), the
	 * greater-than sign (>), and the ampersand (&).
	 */

	/*
	 * doc comments should be readable both in the source code and in the generated
	 * documentation.
	 */

	/*
	 * To avoid confusion, no two members or constructors in a class or interface
	 * should have the same summary description.
	 */

	/*
	 * In Java 9, a client-side index was added to the HTML generated by Javadoc.
	 */

	/*
	 * Generics, enums, and annotations require special care in doc comments. When
	 * documenting a generic type or method, be sure to document all type
	 * parameters:
	 */

	/*
	 * When documenting an enum type, be sure to document the constants as well as
	 * the type and any public methods.
	 */

	/*
	 * When documenting an annotation type, be sure to document any members as well
	 * as the type itself
	 */
	/*
	 * Package-level doc comments should be placed in a file named packageinfo.
	 * java. In addition to these comments, package-info.java must contain a package
	 * declaration and may contain annotations on this declaration. Similarly, if
	 * you elect to use the module system (Item 15), module-level comments should be
	 * placed in the module-info.java file.
	 */

	/*
	 * Two aspects of APIs that are often neglected in documentation are
	 * threadsafety and serializability. Whether or not a class or static method is
	 * thread-safe, you should document its thread-safety level, as described in
	 * Item 82. If a class is serializable, you should document its serialized form,
	 * as described in Item 87.
	 */
	/*
	 * To summarize, documentation comments are the best, most effective way to
	 * document your API. Their use should be considered mandatory for all exported
	 * API elements. Adopt a consistent style that adheres to standard conventions.
	 * Remember that arbitrary HTML is permissible in documentation comments and
	 * that HTML metacharacters must be escaped.
	 */
}
