// Generated from org\pgcase\xobot\parsers\postgres\Sql.g4 by ANTLR 4.5
package org.pgcase.xobot.parsers.postgres;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(SqlParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmtmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmulti(SqlParser.StmtmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoleStmt(SqlParser.CreateRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with(SqlParser.Opt_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptRoleList(SqlParser.OptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleList(SqlParser.AlterOptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(SqlParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(SqlParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserStmt(SqlParser.CreateUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleStmt(SqlParser.AlterRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_in_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_in_database(SqlParser.Opt_in_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterRoleSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoleSetStmt(SqlParser.AlterRoleSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserStmt(SqlParser.AlterUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserSetStmt(SqlParser.AlterUserSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoleStmt(SqlParser.DropRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropUserStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserStmt(SqlParser.DropUserStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroupStmt(SqlParser.CreateGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupStmt(SqlParser.AlterGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#add_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop(SqlParser.Add_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropGroupStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropGroupStmt(SqlParser.DropGroupStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStmt(SqlParser.CreateSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optSchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaName(SqlParser.OptSchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optSchemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSchemaEltList(SqlParser.OptSchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_stmt(SqlParser.Schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSetStmt(SqlParser.VariableSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest(SqlParser.Set_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_rest_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest_more(SqlParser.Set_rest_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(SqlParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(SqlParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(SqlParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#iso_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIso_level(SqlParser.Iso_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_boolean_or_string(SqlParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone_value(SqlParser.Zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_encoding(SqlParser.Opt_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colId_or_Sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId_or_Sconst(SqlParser.ColId_or_SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(SqlParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(SqlParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSetResetClause(SqlParser.FunctionSetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variableShowStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableShowStmt(SqlParser.VariableShowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintsSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetStmt(SqlParser.ConstraintsSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraints_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_list(SqlParser.Constraints_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_mode(SqlParser.Constraints_set_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#checkPointStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPointStmt(SqlParser.CheckPointStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#discardStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardStmt(SqlParser.DiscardStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(SqlParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmds(SqlParser.Alter_table_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmd(SqlParser.Alter_table_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_default(SqlParser.Alter_column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_drop_behavior(SqlParser.Opt_drop_behaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate_clause(SqlParser.Opt_collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_using(SqlParser.Alter_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(SqlParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reloptions(SqlParser.Opt_reloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloption_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_list(SqlParser.Reloption_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reloption_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_elem(SqlParser.Reloption_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterCompositeTypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCompositeTypeStmt(SqlParser.AlterCompositeTypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmds(SqlParser.Alter_type_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmd(SqlParser.Alter_type_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#closePortalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosePortalStmt(SqlParser.ClosePortalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStmt(SqlParser.CopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from(SqlParser.Copy_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_name(SqlParser.Copy_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(SqlParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_list(SqlParser.Copy_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_item(SqlParser.Copy_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_binary(SqlParser.Opt_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_oids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_oids(SqlParser.Opt_oidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_delimiter(SqlParser.Copy_delimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_using(SqlParser.Opt_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_list(SqlParser.Copy_generic_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_elem(SqlParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg(SqlParser.Copy_generic_opt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list(SqlParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list_item(SqlParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStmt(SqlParser.CreateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTemp(SqlParser.OptTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableElementList(SqlParser.OptTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTypedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTypedTableElementList(SqlParser.OptTypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(SqlParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElementList(SqlParser.TypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(SqlParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typedTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElement(SqlParser.TypedTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(SqlParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(SqlParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(SqlParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(SqlParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraintElem(SqlParser.ColConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(SqlParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(SqlParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(SqlParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(SqlParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(SqlParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintElem(SqlParser.ConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no_inherit(SqlParser.Opt_no_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column_list(SqlParser.Opt_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(SqlParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(SqlParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_match(SqlParser.Key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(SqlParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintElem(SqlParser.ExclusionConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(SqlParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_actions(SqlParser.Key_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_update(SqlParser.Key_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_delete(SqlParser.Key_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#key_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_action(SqlParser.Key_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInherit(SqlParser.OptInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWith(SqlParser.OptWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(SqlParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpace(SqlParser.OptTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optConsTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConsTableSpace(SqlParser.OptConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#existingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingIndex(SqlParser.ExistingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createAsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAsStmt(SqlParser.CreateAsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_as_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_as_target(SqlParser.Create_as_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_with_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_data(SqlParser.Opt_with_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSeqStmt(SqlParser.CreateSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterSeqStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSeqStmt(SqlParser.AlterSeqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optSeqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSeqOptList(SqlParser.OptSeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(SqlParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(SqlParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by(SqlParser.Opt_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(SqlParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numericOnly_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly_list(SqlParser.NumericOnly_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePLangStmt(SqlParser.CreatePLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_trusted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_trusted(SqlParser.Opt_trustedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#handler_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler_name(SqlParser.Handler_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_inline_handler(SqlParser.Opt_inline_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#validator_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator_clause(SqlParser.Validator_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_validator(SqlParser.Opt_validatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropPLangStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPLangStmt(SqlParser.DropPLangStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_procedural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_procedural(SqlParser.Opt_proceduralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpaceStmt(SqlParser.CreateTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableSpaceOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableSpaceOwner(SqlParser.OptTableSpaceOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTableSpaceStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableSpaceStmt(SqlParser.DropTableSpaceStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionStmt(SqlParser.CreateExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_list(SqlParser.Create_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_item(SqlParser.Create_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterExtensionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionStmt(SqlParser.AlterExtensionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_list(SqlParser.Alter_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_item(SqlParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterExtensionContentsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionContentsStmt(SqlParser.AlterExtensionContentsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFdwStmt(SqlParser.CreateFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fdw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_option(SqlParser.Fdw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_options(SqlParser.Fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fdw_options(SqlParser.Opt_fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFdwStmt(SqlParser.DropFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterFdwStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFdwStmt(SqlParser.AlterFdwStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_generic_options(SqlParser.Create_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_list(SqlParser.Generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_options(SqlParser.Alter_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_list(SqlParser.Alter_generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_elem(SqlParser.Alter_generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_elem(SqlParser.Generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_name(SqlParser.Generic_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#generic_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_arg(SqlParser.Generic_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignServerStmt(SqlParser.CreateForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type(SqlParser.Opt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_server_version(SqlParser.Foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_foreign_server_version(SqlParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignServerStmt(SqlParser.DropForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterForeignServerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignServerStmt(SqlParser.AlterForeignServerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableStmt(SqlParser.CreateForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optForeignTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptForeignTableElementList(SqlParser.OptForeignTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreignTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignTableElementList(SqlParser.ForeignTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreignTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignTableElement(SqlParser.ForeignTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterForeignTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableStmt(SqlParser.AlterForeignTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMappingStmt(SqlParser.CreateUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#auth_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_ident(SqlParser.Auth_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMappingStmt(SqlParser.DropUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterUserMappingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMappingStmt(SqlParser.AlterUserMappingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigStmt(SqlParser.CreateTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(SqlParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(SqlParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(SqlParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(SqlParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForOptEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForOptEach(SqlParser.TriggerForOptEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForType(SqlParser.TriggerForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(SqlParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(SqlParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(SqlParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optConstrFromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConstrFromTable(SqlParser.OptConstrFromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(SqlParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(SqlParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropTrigStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigStmt(SqlParser.DropTrigStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAssertStmt(SqlParser.CreateAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropAssertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAssertStmt(SqlParser.DropAssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defineStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineStmt(SqlParser.DefineStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SqlParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_list(SqlParser.Def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_elem(SqlParser.Def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arg(SqlParser.Def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aggr_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args(SqlParser.Aggr_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_definition(SqlParser.Old_aggr_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_list(SqlParser.Old_aggr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_elem(SqlParser.Old_aggr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_enum_val_list(SqlParser.Opt_enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_val_list(SqlParser.Enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterEnumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEnumStmt(SqlParser.AlterEnumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpClassStmt(SqlParser.CreateOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item_list(SqlParser.Opclass_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item(SqlParser.Opclass_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_default(SqlParser.Opt_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_opfamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_opfamily(SqlParser.Opt_opfamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_purpose(SqlParser.Opclass_purposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_recheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_recheck(SqlParser.Opt_recheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOpFamilyStmt(SqlParser.CreateOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOpFamilyStmt(SqlParser.AlterOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop_list(SqlParser.Opclass_drop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opclass_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop(SqlParser.Opclass_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOpClassStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpClassStmt(SqlParser.DropOpClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOpFamilyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOpFamilyStmt(SqlParser.DropOpFamilyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwnedStmt(SqlParser.DropOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reassignOwnedStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwnedStmt(SqlParser.ReassignOwnedStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStmt(SqlParser.DropStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(SqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_list(SqlParser.Any_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(SqlParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(SqlParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restart_seqs(SqlParser.Opt_restart_seqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStmt(SqlParser.CommentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comment_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_type(SqlParser.Comment_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comment_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_text(SqlParser.Comment_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#secLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecLabelStmt(SqlParser.SecLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_provider(SqlParser.Opt_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#security_label_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label_type(SqlParser.Security_label_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(SqlParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStmt(SqlParser.FetchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_args(SqlParser.Fetch_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_in(SqlParser.From_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_from_in(SqlParser.Opt_from_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStmt(SqlParser.GrantStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#revokeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeStmt(SqlParser.RevokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(SqlParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_list(SqlParser.Privilege_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(SqlParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_target(SqlParser.Privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantee_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_list(SqlParser.Grantee_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(SqlParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_grant_option(SqlParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes_list(SqlParser.Function_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes(SqlParser.Function_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grantRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantRoleStmt(SqlParser.GrantRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#revokeRoleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeRoleStmt(SqlParser.RevokeRoleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_admin_option(SqlParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_granted_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_granted_by(SqlParser.Opt_granted_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDefaultPrivilegesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivilegesStmt(SqlParser.AlterDefaultPrivilegesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(SqlParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(SqlParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(SqlParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacl_privilege_target(SqlParser.Defacl_privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexStmt(SqlParser.IndexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_unique(SqlParser.Opt_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_concurrently}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_concurrently(SqlParser.Opt_concurrentlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_index_name(SqlParser.Opt_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method_clause(SqlParser.Access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_params(SqlParser.Index_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem(SqlParser.Index_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate(SqlParser.Opt_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class(SqlParser.Opt_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asc_desc(SqlParser.Opt_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nulls_order(SqlParser.Opt_nulls_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStmt(SqlParser.CreateFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_or_replace(SqlParser.Opt_or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(SqlParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_list(SqlParser.Func_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults(SqlParser.Func_args_with_defaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults_list(SqlParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(SqlParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arg_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_class(SqlParser.Arg_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(SqlParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(SqlParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(SqlParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_with_default(SqlParser.Func_arg_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_list(SqlParser.Createfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_func_opt_item(SqlParser.Common_func_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_item(SqlParser.Createfunc_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_as(SqlParser.Func_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_definition(SqlParser.Opt_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_func_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column(SqlParser.Table_func_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_func_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column_list(SqlParser.Table_func_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterFunctionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStmt(SqlParser.AlterFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunc_opt_list(SqlParser.Alterfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restrict(SqlParser.Opt_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeFuncStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveFuncStmt(SqlParser.RemoveFuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeAggrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveAggrStmt(SqlParser.RemoveAggrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#removeOperStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveOperStmt(SqlParser.RemoveOperStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#oper_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_argtypes(SqlParser.Oper_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_operator(SqlParser.Any_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#doStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(SqlParser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_list(SqlParser.Dostmt_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_item(SqlParser.Dostmt_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCastStmt(SqlParser.CreateCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cast_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_context(SqlParser.Cast_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropCastStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCastStmt(SqlParser.DropCastStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_exists(SqlParser.Opt_if_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reindexStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexStmt(SqlParser.ReindexStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reindex_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_type(SqlParser.Reindex_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_force}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_force(SqlParser.Opt_forceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#renameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameStmt(SqlParser.RenameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column(SqlParser.Opt_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_set_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_set_data(SqlParser.Opt_set_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterObjectSchemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterObjectSchemaStmt(SqlParser.AlterObjectSchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterOwnerStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOwnerStmt(SqlParser.AlterOwnerStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStmt(SqlParser.RuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(SqlParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(SqlParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(SqlParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ruleActionStmtOrEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmtOrEmpty(SqlParser.RuleActionStmtOrEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(SqlParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_instead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_instead(SqlParser.Opt_insteadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropRuleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRuleStmt(SqlParser.DropRuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(SqlParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#notify_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_payload(SqlParser.Notify_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#listenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListenStmt(SqlParser.ListenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unlistenStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlistenStmt(SqlParser.UnlistenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transactionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStmt(SqlParser.TransactionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction(SqlParser.Opt_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_item(SqlParser.Transaction_mode_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(SqlParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list_or_empty(SqlParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#viewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewStmt(SqlParser.ViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_check_option(SqlParser.Opt_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(SqlParser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbStmt(SqlParser.CreatedbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_list(SqlParser.Createdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_item(SqlParser.Createdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_equal(SqlParser.Opt_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDatabaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseStmt(SqlParser.AlterDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDatabaseSetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseSetStmt(SqlParser.AlterDatabaseSetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_list(SqlParser.Alterdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdb_opt_item(SqlParser.Alterdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dropdbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdbStmt(SqlParser.DropdbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStmt(SqlParser.CreateDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterDomainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainStmt(SqlParser.AlterDomainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_as(SqlParser.Opt_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTSDictionaryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSDictionaryStmt(SqlParser.AlterTSDictionaryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alterTSConfigurationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTSConfigurationStmt(SqlParser.AlterTSConfigurationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createConversionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversionStmt(SqlParser.CreateConversionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#clusterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterStmt(SqlParser.ClusterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_specification(SqlParser.Cluster_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuumStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumStmt(SqlParser.VacuumStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuum_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_list(SqlParser.Vacuum_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuum_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option_elem(SqlParser.Vacuum_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyzeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeStmt(SqlParser.AnalyzeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyze_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_keyword(SqlParser.Analyze_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_verbose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_verbose(SqlParser.Opt_verboseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_full(SqlParser.Opt_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_freeze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_freeze(SqlParser.Opt_freezeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_name_list(SqlParser.Opt_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStmt(SqlParser.ExplainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(SqlParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_list(SqlParser.Explain_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_elem(SqlParser.Explain_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_name(SqlParser.Explain_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#explain_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_arg(SqlParser.Explain_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prepareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStmt(SqlParser.PrepareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#prep_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrep_type_clause(SqlParser.Prep_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(SqlParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(SqlParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#execute_param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_param_clause(SqlParser.Execute_param_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deallocateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocateStmt(SqlParser.DeallocateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(SqlParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_rest(SqlParser.Insert_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(SqlParser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_column_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_item(SqlParser.Insert_column_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(SqlParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(SqlParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(SqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(SqlParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_lock(SqlParser.Opt_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(SqlParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait(SqlParser.Opt_nowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(SqlParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(SqlParser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(SqlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_set_clause(SqlParser.Single_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#multiple_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_set_clause(SqlParser.Multiple_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target(SqlParser.Set_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target_list(SqlParser.Set_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declareCursorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursorStmt(SqlParser.DeclareCursorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(SqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_options(SqlParser.Cursor_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_hold(SqlParser.Opt_holdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(SqlParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_with_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_parens(SqlParser.Select_with_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_no_parens(SqlParser.Select_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(SqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(SqlParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_list(SqlParser.Cte_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expr(SqlParser.Common_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_clause(SqlParser.Opt_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(SqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into_clause_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause_arguments(SqlParser.Into_clause_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into_clause_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause_argument(SqlParser.Into_clause_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(SqlParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_table(SqlParser.Opt_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_all(SqlParser.Opt_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_distinct(SqlParser.Opt_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sort_clause(SqlParser.Opt_sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(SqlParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sortby_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby_list(SqlParser.Sortby_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(SqlParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit(SqlParser.Select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_limit(SqlParser.Opt_select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(SqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(SqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_value(SqlParser.Select_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_offset_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value(SqlParser.Select_offset_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_select_fetch_first_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_fetch_first_value(SqlParser.Opt_select_fetch_first_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_offset_value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value2(SqlParser.Select_offset_value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row_or_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_rows(SqlParser.Row_or_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#first_or_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_or_next(SqlParser.First_or_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(SqlParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_clause(SqlParser.For_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_locking_clause(SqlParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_items(SqlParser.For_locking_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_locking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_item(SqlParser.For_locking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#locked_rels_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked_rels_list(SqlParser.Locked_rels_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(SqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(SqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_list(SqlParser.From_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(SqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_ref2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref2(SqlParser.Table_ref2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(SqlParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(SqlParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(SqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_outer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_outer(SqlParser.Join_outerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_qual(SqlParser.Join_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr(SqlParser.Relation_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_list(SqlParser.Relation_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_opt_alias(SqlParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_table(SqlParser.Func_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_or_current_clause(SqlParser.Where_or_current_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#optTableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTableFuncElementList(SqlParser.OptTableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(SqlParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(SqlParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(SqlParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_bounds(SqlParser.Opt_array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simpleTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypename(SqlParser.SimpleTypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTypename(SqlParser.ConstTypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(SqlParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type_modifiers(SqlParser.Opt_type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(SqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_float(SqlParser.Opt_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(SqlParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constBit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBit(SqlParser.ConstBitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(SqlParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(SqlParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#character_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_(SqlParser.Character_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstCharacter(SqlParser.ConstCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(SqlParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(SqlParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(SqlParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_varying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_varying(SqlParser.Opt_varyingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_charset(SqlParser.Opt_charsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(SqlParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(SqlParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_timezone(SqlParser.Opt_timezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_interval(SqlParser.Opt_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#interval_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_second(SqlParser.Interval_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#a_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr(SqlParser.A_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#b_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_expr(SqlParser.B_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr(SqlParser.C_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(SqlParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_root_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_root_version(SqlParser.Xml_root_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_xml_root_standalone(SqlParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes(SqlParser.Xml_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_list(SqlParser.Xml_attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_el(SqlParser.Xml_attribute_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#document_or_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_or_content(SqlParser.Document_or_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_whitespace_option(SqlParser.Xml_whitespace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlexists_argument(SqlParser.Xmlexists_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(SqlParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(SqlParser.Window_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(SqlParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(SqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(SqlParser.Window_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_existing_window_name(SqlParser.Opt_existing_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_partition_clause(SqlParser.Opt_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_frame_clause(SqlParser.Opt_frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_extent(SqlParser.Frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(SqlParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(SqlParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_type(SqlParser.Sub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_Op(SqlParser.All_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(SqlParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qual_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_Op(SqlParser.Qual_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qual_all_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_all_Op(SqlParser.Qual_all_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subquery_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_Op(SqlParser.Subquery_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(SqlParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_list(SqlParser.Func_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_expr(SqlParser.Func_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(SqlParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(SqlParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr_list(SqlParser.Array_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#extract_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_list(SqlParser.Extract_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#extract_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_arg(SqlParser.Extract_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#overlay_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_list(SqlParser.Overlay_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#overlay_placing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_placing(SqlParser.Overlay_placingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#position_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_list(SqlParser.Position_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_list(SqlParser.Substr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_from(SqlParser.Substr_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#substr_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_for(SqlParser.Substr_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_list(SqlParser.Trim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr(SqlParser.In_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(SqlParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#when_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause_list(SqlParser.When_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(SqlParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_default(SqlParser.Case_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#case_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_arg(SqlParser.Case_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(SqlParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indirection_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_el(SqlParser.Indirection_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(SqlParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_indirection(SqlParser.Opt_indirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#opt_asymmetric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asymmetric(SqlParser.Opt_asymmetricContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr(SqlParser.Ctext_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_expr_list(SqlParser.Ctext_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ctext_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtext_row(SqlParser.Ctext_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(SqlParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_el(SqlParser.Target_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name_list(SqlParser.Qualified_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(SqlParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(SqlParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method(SqlParser.Access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(SqlParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(SqlParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(SqlParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#iconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconst(SqlParser.IconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSconst(SqlParser.SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#roleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleId(SqlParser.RoleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(SqlParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(SqlParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_name(SqlParser.Type_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(SqlParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved_keyword(SqlParser.Unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#col_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name_keyword(SqlParser.Col_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_func_name_keyword(SqlParser.Type_func_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_keyword(SqlParser.Reserved_keywordContext ctx);
}