<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Lista de Projetos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>Lista de Projetos</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Data de Início</th>
            <th>Data de Previsão de Término</th>
            <th>Descrição</th>
            <th>Status</th>
            <th>Orçamento</th>
            <th>Risco</th>
            <th>Ações</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="projeto" items="${projetos}">
            <tr>
                <td>${projeto.nome}</td>
                <td>${projeto.dataInicio}</td>
                <td>${projeto.dataPrevisaoFim}</td>
                <td>${projeto.descricao}</td>
                <td>${projeto.status}</td>
                <td>${projeto.orcamento}</td>
                <td>${projeto.risco}</td>
                <td>
                    <a href="<c:url value='/projetos/${projeto.id}'/>">Detalhes</a>
                    <a href="<c:url value='/projetos/${projeto.id}/editar'/>">Editar</a>
                    <a href="<c:url value='/projetos/${projeto.id}/excluir'/>">Excluir</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="<c:url value='/projetos/novo'/>">Novo Projeto</a>
</div>

</body>
</html>