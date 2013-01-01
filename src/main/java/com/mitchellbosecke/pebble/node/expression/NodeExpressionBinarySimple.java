/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Copyright (c) 2012 Mitchell Bosecke.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 
 * Unported License. To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/3.0/
 ******************************************************************************/
package com.mitchellbosecke.pebble.node.expression;

import com.mitchellbosecke.pebble.compiler.Compiler;

public abstract class NodeExpressionBinarySimple extends NodeExpressionBinary {

	@Override
	public void compile(Compiler compiler) {
		compiler.raw("(").subcompile(left).raw(" ");
		this.operator(compiler);
		compiler.raw(" ").subcompile(right).raw(")");
	}
	
	public abstract void operator(Compiler compiler);

}