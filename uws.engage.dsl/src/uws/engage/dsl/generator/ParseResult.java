package uws.engage.dsl.generator;

import java.util.List;

import org.eclipse.xtext.validation.Issue;

import uws.engage.dsl.assess.Model;

public class ParseResult {
	public Model model;
	public List<Issue> issues;
}
