package org.zkieda.wanna;

/**
 * An annotation for declaring use cases for some part of java code. 
 * 
 * If used in classes in key points, we will allow documentation to be easily searchable. 
 * 
 * 
 * TODO : find out a syntax that a person could use for documenting to improve the searchability.
 * TODO : be able to parse javadoc and get the tag
 * TODO : (long term) finish this idea - possibly have a SQLlite database?
 * TODO : eclipse plugin 
 * 
 * IDEA : "This is my use case with an *important* keyword and *important keyphrase*"
 * IDEA : "This is my [use case, documentation] with different re[prasing, wordings]"
 * IDEA BETTER : just have it in javadoc, then eclipse could make it easier
 * 
 * @wanna {
 * 		document a use case that is searchable
 * 		document with putting \sspaces\ttabs\nnew lines explicitly
 * }
 * @author zkieda
 */
//@Retention(RetentionPolicy.SOURCE)
//@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PACKAGE, ElementType.ANNOTATION_TYPE})
//@IWanna("document a use case that is searchable")
//public @interface IWanna {
//	//the identifier that is local to the class. When we set
//	public String[] value();
//}

