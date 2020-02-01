// Generated from org\pgcase\xobot\parsers\postgres\PlPgSql.g4 by ANTLR 4.5
package org.pgcase.xobot.parsers.postgres;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlPgSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlPgSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#pl_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_function(PlPgSqlParser.Pl_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comp_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_options(PlPgSqlParser.Comp_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comp_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_option(PlPgSqlParser.Comp_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_semi(PlPgSqlParser.Opt_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#pl_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_block(PlPgSqlParser.Pl_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_sect(PlPgSqlParser.Decl_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_start(PlPgSqlParser.Decl_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmts(PlPgSqlParser.Decl_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(PlPgSqlParser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_statement(PlPgSqlParser.Decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_scrollable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_scrollable(PlPgSqlParser.Opt_scrollableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_query(PlPgSqlParser.Decl_cursor_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_args(PlPgSqlParser.Decl_cursor_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arglist(PlPgSqlParser.Decl_cursor_arglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arg(PlPgSqlParser.Decl_cursor_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_is_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_is_for(PlPgSqlParser.Decl_is_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_aliasitem(PlPgSqlParser.Decl_aliasitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_varname(PlPgSqlParser.Decl_varnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_const(PlPgSqlParser.Decl_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_datatype(PlPgSqlParser.Decl_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_collate(PlPgSqlParser.Decl_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_notnull(PlPgSqlParser.Decl_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_defval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defval(PlPgSqlParser.Decl_defvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#decl_defkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defkey(PlPgSqlParser.Decl_defkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operator(PlPgSqlParser.Assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_sect(PlPgSqlParser.Proc_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmts(PlPgSqlParser.Proc_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt(PlPgSqlParser.Proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_perform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_perform(PlPgSqlParser.Stmt_performContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_assign(PlPgSqlParser.Stmt_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_getdiag(PlPgSqlParser.Stmt_getdiagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_area_opt(PlPgSqlParser.Getdiag_area_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list(PlPgSqlParser.Getdiag_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list_item(PlPgSqlParser.Getdiag_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_item(PlPgSqlParser.Getdiag_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#getdiag_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_target(PlPgSqlParser.Getdiag_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(PlPgSqlParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if(PlPgSqlParser.Stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_elsif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_elsif(PlPgSqlParser.Stmt_elsifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_else(PlPgSqlParser.Stmt_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_case(PlPgSqlParser.Stmt_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_expr_until_when(PlPgSqlParser.Opt_expr_until_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_list(PlPgSqlParser.Case_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when(PlPgSqlParser.Case_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_case_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_case_else(PlPgSqlParser.Opt_case_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_loop(PlPgSqlParser.Stmt_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_while(PlPgSqlParser.Stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for(PlPgSqlParser.Stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_control(PlPgSqlParser.For_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_variable(PlPgSqlParser.For_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_foreach_a(PlPgSqlParser.Stmt_foreach_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreach_slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_slice(PlPgSqlParser.Foreach_sliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_exit(PlPgSqlParser.Stmt_exitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_type(PlPgSqlParser.Exit_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_return(PlPgSqlParser.Stmt_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_raise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_raise(PlPgSqlParser.Stmt_raiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#raiseLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseLevel(PlPgSqlParser.RaiseLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#raise_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_expr(PlPgSqlParser.Raise_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(PlPgSqlParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_execsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_execsql(PlPgSqlParser.Stmt_execsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_dynexecute(PlPgSqlParser.Stmt_dynexecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(PlPgSqlParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingClauseArgumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClauseArgumentsList(PlPgSqlParser.UsingClauseArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#usingClauseArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClauseArgument(PlPgSqlParser.UsingClauseArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_open(PlPgSqlParser.Stmt_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursorArgumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorArgumentsList(PlPgSqlParser.CursorArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursorArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorArgument(PlPgSqlParser.CursorArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_fetch(PlPgSqlParser.Stmt_fetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_move(PlPgSqlParser.Stmt_moveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fetch_direction(PlPgSqlParser.Opt_fetch_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_close(PlPgSqlParser.Stmt_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_null(PlPgSqlParser.Stmt_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable(PlPgSqlParser.Cursor_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exception_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_sect(PlPgSqlParser.Exception_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_exceptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exceptions(PlPgSqlParser.Proc_exceptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exception(PlPgSqlParser.Proc_exceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_conditions(PlPgSqlParser.Proc_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#proc_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_condition(PlPgSqlParser.Proc_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_semi(PlPgSqlParser.Expr_until_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_rightbracket(PlPgSqlParser.Expr_until_rightbracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_then(PlPgSqlParser.Expr_until_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_loop(PlPgSqlParser.Expr_until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_block_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_block_label(PlPgSqlParser.Opt_block_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_label(PlPgSqlParser.Opt_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_exitcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_exitcond(PlPgSqlParser.Opt_exitcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_identifier(PlPgSqlParser.Any_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(PlPgSqlParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmulti(PlPgSqlParser.StmtmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PlPgSqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStmt(PlPgSqlParser.CreateRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with(PlPgSqlParser.Opt_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptRoleList(PlPgSqlParser.OptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleList(PlPgSqlParser.AlterOptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(PlPgSqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(PlPgSqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserStmt(PlPgSqlParser.CreateUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleStmt(PlPgSqlParser.AlterRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_in_database(PlPgSqlParser.Opt_in_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleSetStmt(PlPgSqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserStmt(PlPgSqlParser.AlterUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserSetStmt(PlPgSqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleStmt(PlPgSqlParser.DropRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserStmt(PlPgSqlParser.DropUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroupStmt(PlPgSqlParser.CreateGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupStmt(PlPgSqlParser.AlterGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#add_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop(PlPgSqlParser.Add_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropGroupStmt(PlPgSqlParser.DropGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStmt(PlPgSqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaName(PlPgSqlParser.OptSchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaEltList(PlPgSqlParser.OptSchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_stmt(PlPgSqlParser.Schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSetStmt(PlPgSqlParser.VariableSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest(PlPgSqlParser.Set_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest_more(PlPgSqlParser.Set_rest_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(PlPgSqlParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(PlPgSqlParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(PlPgSqlParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#iso_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIso_level(PlPgSqlParser.Iso_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_boolean_or_string(PlPgSqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone_value(PlPgSqlParser.Zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_encoding(PlPgSqlParser.Opt_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId_or_Sconst(PlPgSqlParser.ColId_or_SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(PlPgSqlParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(PlPgSqlParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSetResetClause(PlPgSqlParser.FunctionSetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableShowStmt(PlPgSqlParser.VariableShowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetStmt(PlPgSqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_list(PlPgSqlParser.Constraints_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_mode(PlPgSqlParser.Constraints_set_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPointStmt(PlPgSqlParser.CheckPointStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#discardStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardStmt(PlPgSqlParser.DiscardStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(PlPgSqlParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmds(PlPgSqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmd(PlPgSqlParser.Alter_table_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_default(PlPgSqlParser.Alter_column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_drop_behavior(PlPgSqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate_clause(PlPgSqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_using(PlPgSqlParser.Alter_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(PlPgSqlParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reloptions(PlPgSqlParser.Opt_reloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloption_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_list(PlPgSqlParser.Reloption_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_elem(PlPgSqlParser.Reloption_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCompositeTypeStmt(PlPgSqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmds(PlPgSqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmd(PlPgSqlParser.Alter_type_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortalStmt(PlPgSqlParser.ClosePortalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStmt(PlPgSqlParser.CopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from(PlPgSqlParser.Copy_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_name(PlPgSqlParser.Copy_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(PlPgSqlParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_list(PlPgSqlParser.Copy_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_item(PlPgSqlParser.Copy_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_binary(PlPgSqlParser.Opt_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_oids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_oids(PlPgSqlParser.Opt_oidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_delimiter(PlPgSqlParser.Copy_delimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_using(PlPgSqlParser.Opt_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_list(PlPgSqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_elem(PlPgSqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg(PlPgSqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list(PlPgSqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list_item(PlPgSqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStmt(PlPgSqlParser.CreateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTemp(PlPgSqlParser.OptTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableElementList(PlPgSqlParser.OptTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTypedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTypedTableElementList(PlPgSqlParser.OptTypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(PlPgSqlParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElementList(PlPgSqlParser.TypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(PlPgSqlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typedTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElement(PlPgSqlParser.TypedTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(PlPgSqlParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(PlPgSqlParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(PlPgSqlParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(PlPgSqlParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraintElem(PlPgSqlParser.ColConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(PlPgSqlParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(PlPgSqlParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(PlPgSqlParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(PlPgSqlParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(PlPgSqlParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintElem(PlPgSqlParser.ConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no_inherit(PlPgSqlParser.Opt_no_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column_list(PlPgSqlParser.Opt_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(PlPgSqlParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(PlPgSqlParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_match(PlPgSqlParser.Key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(PlPgSqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintElem(PlPgSqlParser.ExclusionConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(PlPgSqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_actions(PlPgSqlParser.Key_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_update(PlPgSqlParser.Key_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_delete(PlPgSqlParser.Key_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#key_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_action(PlPgSqlParser.Key_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInherit(PlPgSqlParser.OptInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWith(PlPgSqlParser.OptWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(PlPgSqlParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpace(PlPgSqlParser.OptTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConsTableSpace(PlPgSqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#existingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingIndex(PlPgSqlParser.ExistingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAsStmt(PlPgSqlParser.CreateAsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_as_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_as_target(PlPgSqlParser.Create_as_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_data(PlPgSqlParser.Opt_with_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSeqStmt(PlPgSqlParser.CreateSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSeqStmt(PlPgSqlParser.AlterSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optSeqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSeqOptList(PlPgSqlParser.OptSeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(PlPgSqlParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(PlPgSqlParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by(PlPgSqlParser.Opt_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(PlPgSqlParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly_list(PlPgSqlParser.NumericOnly_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePLangStmt(PlPgSqlParser.CreatePLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_trusted(PlPgSqlParser.Opt_trustedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#handler_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler_name(PlPgSqlParser.Handler_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_inline_handler(PlPgSqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#validator_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator_clause(PlPgSqlParser.Validator_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_validator(PlPgSqlParser.Opt_validatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPLangStmt(PlPgSqlParser.DropPLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_procedural(PlPgSqlParser.Opt_proceduralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceStmt(PlPgSqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpaceOwner(PlPgSqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableSpaceStmt(PlPgSqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionStmt(PlPgSqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_list(PlPgSqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_item(PlPgSqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionStmt(PlPgSqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_list(PlPgSqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_item(PlPgSqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionContentsStmt(PlPgSqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFdwStmt(PlPgSqlParser.CreateFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fdw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_option(PlPgSqlParser.Fdw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_options(PlPgSqlParser.Fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fdw_options(PlPgSqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFdwStmt(PlPgSqlParser.DropFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFdwStmt(PlPgSqlParser.AlterFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_generic_options(PlPgSqlParser.Create_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_list(PlPgSqlParser.Generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_options(PlPgSqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_list(PlPgSqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_elem(PlPgSqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_elem(PlPgSqlParser.Generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_name(PlPgSqlParser.Generic_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_arg(PlPgSqlParser.Generic_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignServerStmt(PlPgSqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type(PlPgSqlParser.Opt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_server_version(PlPgSqlParser.Foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_foreign_server_version(PlPgSqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignServerStmt(PlPgSqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignServerStmt(PlPgSqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableStmt(PlPgSqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optForeignTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptForeignTableElementList(PlPgSqlParser.OptForeignTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreignTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignTableElementList(PlPgSqlParser.ForeignTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#foreignTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignTableElement(PlPgSqlParser.ForeignTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableStmt(PlPgSqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMappingStmt(PlPgSqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#auth_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_ident(PlPgSqlParser.Auth_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMappingStmt(PlPgSqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMappingStmt(PlPgSqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigStmt(PlPgSqlParser.CreateTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(PlPgSqlParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(PlPgSqlParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(PlPgSqlParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(PlPgSqlParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForOptEach(PlPgSqlParser.TriggerForOptEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForType(PlPgSqlParser.TriggerForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(PlPgSqlParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(PlPgSqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(PlPgSqlParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConstrFromTable(PlPgSqlParser.OptConstrFromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(PlPgSqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(PlPgSqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigStmt(PlPgSqlParser.DropTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAssertStmt(PlPgSqlParser.CreateAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAssertStmt(PlPgSqlParser.DropAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(PlPgSqlParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PlPgSqlParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_list(PlPgSqlParser.Def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_elem(PlPgSqlParser.Def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arg(PlPgSqlParser.Def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#aggr_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args(PlPgSqlParser.Aggr_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_definition(PlPgSqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_list(PlPgSqlParser.Old_aggr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_elem(PlPgSqlParser.Old_aggr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_enum_val_list(PlPgSqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_val_list(PlPgSqlParser.Enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEnumStmt(PlPgSqlParser.AlterEnumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpClassStmt(PlPgSqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item_list(PlPgSqlParser.Opclass_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item(PlPgSqlParser.Opclass_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_default(PlPgSqlParser.Opt_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_opfamily(PlPgSqlParser.Opt_opfamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_purpose(PlPgSqlParser.Opclass_purposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_recheck(PlPgSqlParser.Opt_recheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpFamilyStmt(PlPgSqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOpFamilyStmt(PlPgSqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop_list(PlPgSqlParser.Opclass_drop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop(PlPgSqlParser.Opclass_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpClassStmt(PlPgSqlParser.DropOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpFamilyStmt(PlPgSqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwnedStmt(PlPgSqlParser.DropOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwnedStmt(PlPgSqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStmt(PlPgSqlParser.DropStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(PlPgSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_list(PlPgSqlParser.Any_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(PlPgSqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(PlPgSqlParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(PlPgSqlParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restart_seqs(PlPgSqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#commentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStmt(PlPgSqlParser.CommentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comment_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_type(PlPgSqlParser.Comment_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#comment_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_text(PlPgSqlParser.Comment_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecLabelStmt(PlPgSqlParser.SecLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_provider(PlPgSqlParser.Opt_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#security_label_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label_type(PlPgSqlParser.Security_label_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(PlPgSqlParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStmt(PlPgSqlParser.FetchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#fetch_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_args(PlPgSqlParser.Fetch_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_in(PlPgSqlParser.From_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_from_in(PlPgSqlParser.Opt_from_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStmt(PlPgSqlParser.GrantStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeStmt(PlPgSqlParser.RevokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(PlPgSqlParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_list(PlPgSqlParser.Privilege_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(PlPgSqlParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_target(PlPgSqlParser.Privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantee_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_list(PlPgSqlParser.Grantee_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(PlPgSqlParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_grant_option(PlPgSqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes_list(PlPgSqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes(PlPgSqlParser.Function_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleStmt(PlPgSqlParser.GrantRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleStmt(PlPgSqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_admin_option(PlPgSqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_granted_by(PlPgSqlParser.Opt_granted_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivilegesStmt(PlPgSqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(PlPgSqlParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(PlPgSqlParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(PlPgSqlParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacl_privilege_target(PlPgSqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexStmt(PlPgSqlParser.IndexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_unique(PlPgSqlParser.Opt_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_concurrently(PlPgSqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_index_name(PlPgSqlParser.Opt_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method_clause(PlPgSqlParser.Access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_params(PlPgSqlParser.Index_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem(PlPgSqlParser.Index_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate(PlPgSqlParser.Opt_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class(PlPgSqlParser.Opt_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asc_desc(PlPgSqlParser.Opt_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nulls_order(PlPgSqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStmt(PlPgSqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_or_replace(PlPgSqlParser.Opt_or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(PlPgSqlParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_list(PlPgSqlParser.Func_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults(PlPgSqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults_list(PlPgSqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(PlPgSqlParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#arg_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_class(PlPgSqlParser.Arg_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(PlPgSqlParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(PlPgSqlParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(PlPgSqlParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_with_default(PlPgSqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_list(PlPgSqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_func_opt_item(PlPgSqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_item(PlPgSqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_as(PlPgSqlParser.Func_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_definition(PlPgSqlParser.Opt_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_func_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column(PlPgSqlParser.Table_func_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column_list(PlPgSqlParser.Table_func_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStmt(PlPgSqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunc_opt_list(PlPgSqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restrict(PlPgSqlParser.Opt_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFuncStmt(PlPgSqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveAggrStmt(PlPgSqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveOperStmt(PlPgSqlParser.RemoveOperStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_argtypes(PlPgSqlParser.Oper_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#any_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_operator(PlPgSqlParser.Any_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#doStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(PlPgSqlParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_list(PlPgSqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_item(PlPgSqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCastStmt(PlPgSqlParser.CreateCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cast_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_context(PlPgSqlParser.Cast_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCastStmt(PlPgSqlParser.DropCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_exists(PlPgSqlParser.Opt_if_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexStmt(PlPgSqlParser.ReindexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reindex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_type(PlPgSqlParser.Reindex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_force(PlPgSqlParser.Opt_forceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#renameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStmt(PlPgSqlParser.RenameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column(PlPgSqlParser.Opt_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_set_data(PlPgSqlParser.Opt_set_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterObjectSchemaStmt(PlPgSqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOwnerStmt(PlPgSqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStmt(PlPgSqlParser.RuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(PlPgSqlParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(PlPgSqlParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(PlPgSqlParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmtOrEmpty(PlPgSqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(PlPgSqlParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_instead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_instead(PlPgSqlParser.Opt_insteadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropRuleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRuleStmt(PlPgSqlParser.DropRuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(PlPgSqlParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#notify_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_payload(PlPgSqlParser.Notify_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#listenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListenStmt(PlPgSqlParser.ListenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlistenStmt(PlPgSqlParser.UnlistenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStmt(PlPgSqlParser.TransactionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction(PlPgSqlParser.Opt_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_item(PlPgSqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(PlPgSqlParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list_or_empty(PlPgSqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#viewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewStmt(PlPgSqlParser.ViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_check_option(PlPgSqlParser.Opt_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(PlPgSqlParser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbStmt(PlPgSqlParser.CreatedbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_list(PlPgSqlParser.Createdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_item(PlPgSqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_equal(PlPgSqlParser.Opt_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStmt(PlPgSqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseSetStmt(PlPgSqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_list(PlPgSqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_item(PlPgSqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdbStmt(PlPgSqlParser.DropdbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStmt(PlPgSqlParser.CreateDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainStmt(PlPgSqlParser.AlterDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_as(PlPgSqlParser.Opt_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSDictionaryStmt(PlPgSqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSConfigurationStmt(PlPgSqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversionStmt(PlPgSqlParser.CreateConversionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterStmt(PlPgSqlParser.ClusterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_specification(PlPgSqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumStmt(PlPgSqlParser.VacuumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_list(PlPgSqlParser.Vacuum_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_elem(PlPgSqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeStmt(PlPgSqlParser.AnalyzeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_keyword(PlPgSqlParser.Analyze_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_verbose(PlPgSqlParser.Opt_verboseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_full(PlPgSqlParser.Opt_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_freeze(PlPgSqlParser.Opt_freezeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_name_list(PlPgSqlParser.Opt_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStmt(PlPgSqlParser.ExplainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(PlPgSqlParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_list(PlPgSqlParser.Explain_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_elem(PlPgSqlParser.Explain_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_name(PlPgSqlParser.Explain_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_arg(PlPgSqlParser.Explain_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStmt(PlPgSqlParser.PrepareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrep_type_clause(PlPgSqlParser.Prep_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(PlPgSqlParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(PlPgSqlParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_param_clause(PlPgSqlParser.Execute_param_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateStmt(PlPgSqlParser.DeallocateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(PlPgSqlParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_rest(PlPgSqlParser.Insert_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(PlPgSqlParser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_item(PlPgSqlParser.Insert_column_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(PlPgSqlParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(PlPgSqlParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PlPgSqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(PlPgSqlParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_lock(PlPgSqlParser.Opt_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(PlPgSqlParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait(PlPgSqlParser.Opt_nowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(PlPgSqlParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(PlPgSqlParser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(PlPgSqlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_set_clause(PlPgSqlParser.Single_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_set_clause(PlPgSqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target(PlPgSqlParser.Set_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#set_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target_list(PlPgSqlParser.Set_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStmt(PlPgSqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PlPgSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cursor_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_options(PlPgSqlParser.Cursor_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_hold(PlPgSqlParser.Opt_holdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(PlPgSqlParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_parens(PlPgSqlParser.Select_with_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_no_parens(PlPgSqlParser.Select_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(PlPgSqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(PlPgSqlParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(PlPgSqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#cte_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_list(PlPgSqlParser.Cte_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expr(PlPgSqlParser.Common_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_clause(PlPgSqlParser.Opt_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PlPgSqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#into_clause_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause_arguments(PlPgSqlParser.Into_clause_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#into_clause_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause_argument(PlPgSqlParser.Into_clause_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(PlPgSqlParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_table(PlPgSqlParser.Opt_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_all(PlPgSqlParser.Opt_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_distinct(PlPgSqlParser.Opt_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sort_clause(PlPgSqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(PlPgSqlParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sortby_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby_list(PlPgSqlParser.Sortby_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(PlPgSqlParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit(PlPgSqlParser.Select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_limit(PlPgSqlParser.Opt_select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(PlPgSqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(PlPgSqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_value(PlPgSqlParser.Select_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value(PlPgSqlParser.Select_offset_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_fetch_first_value(PlPgSqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value2(PlPgSqlParser.Select_offset_value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_rows(PlPgSqlParser.Row_or_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#first_or_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_or_next(PlPgSqlParser.First_or_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(PlPgSqlParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PlPgSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_clause(PlPgSqlParser.For_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_locking_clause(PlPgSqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_items(PlPgSqlParser.For_locking_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_item(PlPgSqlParser.For_locking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked_rels_list(PlPgSqlParser.Locked_rels_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(PlPgSqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PlPgSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_list(PlPgSqlParser.From_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(PlPgSqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#table_ref2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref2(PlPgSqlParser.Table_ref2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(PlPgSqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(PlPgSqlParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PlPgSqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#join_outer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_outer(PlPgSqlParser.Join_outerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#join_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_qual(PlPgSqlParser.Join_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr(PlPgSqlParser.Relation_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_list(PlPgSqlParser.Relation_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_opt_alias(PlPgSqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_table(PlPgSqlParser.Func_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PlPgSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_or_current_clause(PlPgSqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#optTableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableFuncElementList(PlPgSqlParser.OptTableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(PlPgSqlParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(PlPgSqlParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(PlPgSqlParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_bounds(PlPgSqlParser.Opt_array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#simpleTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypename(PlPgSqlParser.SimpleTypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTypename(PlPgSqlParser.ConstTypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(PlPgSqlParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type_modifiers(PlPgSqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PlPgSqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_float(PlPgSqlParser.Opt_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(PlPgSqlParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constBit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBit(PlPgSqlParser.ConstBitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(PlPgSqlParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(PlPgSqlParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#character_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_(PlPgSqlParser.Character_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstCharacter(PlPgSqlParser.ConstCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(PlPgSqlParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(PlPgSqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(PlPgSqlParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_varying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_varying(PlPgSqlParser.Opt_varyingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_charset(PlPgSqlParser.Opt_charsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(PlPgSqlParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(PlPgSqlParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_timezone(PlPgSqlParser.Opt_timezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_interval(PlPgSqlParser.Opt_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#interval_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_second(PlPgSqlParser.Interval_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#a_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr(PlPgSqlParser.A_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#b_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_expr(PlPgSqlParser.B_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr(PlPgSqlParser.C_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(PlPgSqlParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_root_version(PlPgSqlParser.Xml_root_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_xml_root_standalone(PlPgSqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes(PlPgSqlParser.Xml_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_list(PlPgSqlParser.Xml_attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_el(PlPgSqlParser.Xml_attribute_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#document_or_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_or_content(PlPgSqlParser.Document_or_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_whitespace_option(PlPgSqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlexists_argument(PlPgSqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(PlPgSqlParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(PlPgSqlParser.Window_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(PlPgSqlParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(PlPgSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(PlPgSqlParser.Window_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_existing_window_name(PlPgSqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_partition_clause(PlPgSqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_frame_clause(PlPgSqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_extent(PlPgSqlParser.Frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(PlPgSqlParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(PlPgSqlParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_type(PlPgSqlParser.Sub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_Op(PlPgSqlParser.All_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(PlPgSqlParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qual_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_Op(PlPgSqlParser.Qual_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_all_Op(PlPgSqlParser.Qual_all_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_Op(PlPgSqlParser.Subquery_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(PlPgSqlParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_list(PlPgSqlParser.Func_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_expr(PlPgSqlParser.Func_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(PlPgSqlParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(PlPgSqlParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr_list(PlPgSqlParser.Array_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#extract_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_list(PlPgSqlParser.Extract_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#extract_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_arg(PlPgSqlParser.Extract_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#overlay_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_list(PlPgSqlParser.Overlay_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_placing(PlPgSqlParser.Overlay_placingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#position_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_list(PlPgSqlParser.Position_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_list(PlPgSqlParser.Substr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_from(PlPgSqlParser.Substr_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#substr_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_for(PlPgSqlParser.Substr_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#trim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_list(PlPgSqlParser.Trim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr(PlPgSqlParser.In_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(PlPgSqlParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause_list(PlPgSqlParser.When_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(PlPgSqlParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_default(PlPgSqlParser.Case_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#case_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_arg(PlPgSqlParser.Case_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(PlPgSqlParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indirection_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_el(PlPgSqlParser.Indirection_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(PlPgSqlParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_indirection(PlPgSqlParser.Opt_indirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asymmetric(PlPgSqlParser.Opt_asymmetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr(PlPgSqlParser.Ctext_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr_list(PlPgSqlParser.Ctext_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#ctext_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_row(PlPgSqlParser.Ctext_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(PlPgSqlParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_el(PlPgSqlParser.Target_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name_list(PlPgSqlParser.Qualified_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(PlPgSqlParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(PlPgSqlParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PlPgSqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(PlPgSqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method(PlPgSqlParser.Access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(PlPgSqlParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(PlPgSqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(PlPgSqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(PlPgSqlParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(PlPgSqlParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#iconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconst(PlPgSqlParser.IconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSconst(PlPgSqlParser.SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#roleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleId(PlPgSqlParser.RoleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(PlPgSqlParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(PlPgSqlParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_name(PlPgSqlParser.Type_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(PlPgSqlParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved_keyword(PlPgSqlParser.Unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name_keyword(PlPgSqlParser.Col_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_func_name_keyword(PlPgSqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlPgSqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_keyword(PlPgSqlParser.Reserved_keywordContext ctx);
}