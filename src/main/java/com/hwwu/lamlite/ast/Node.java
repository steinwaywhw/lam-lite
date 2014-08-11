package com.hwwu.lamlite.ast;

import com.hwwu.lamlite.Scope;
import con.hwwu.lamlite.value.Value;

import java.util.List;
import java.util.ArrayList;

public abstract class Node {
	public String file;
	public int startLine;
	public int endLine;
	public int startCol;
	public int endCol;

	protected Node(String file, int startLine, int startCol, int endLine, int endCol) {
		this.file = file;
		this.startLine = startLine;
		this.startCol = startCol;
		this.endLine = endLine;
		this.endCol = endCol;
	}

	public abstract Value eval(Scope s);
	public abstract Value typecheck(Scope s);

	public String getPosition() {
		if (startCol == endCol && startLine == endLine)
			return String.format("%s [%d:%d]", file, startLine+1, startCol+1)
		else
			return String.format("%s [%d:%d - %d:%d]", file, startLine+1, startCol+1, endLine+1, endCol+1)
	}

}