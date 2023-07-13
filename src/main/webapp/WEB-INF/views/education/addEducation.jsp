<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>
        <!-- Page Content-->


<form method="post" action="<c:url value="/edu/addEducation"/> ">

<div class="container-fluid">
    <!-- Experience-->
    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Add Education</h2>
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="form-group row">
                    <label class="col-2 col-form-label">School</label>
                    <div class="col-10">
                        <input class="form-control" type="text" name="academic" placeholder="fill in the information">
                    </div>


                    <label class="col-2 col-form-label">Academic title</label>
                    <div class="col-10">
                        <input class="form-control" type="text" name="academicTitle" placeholder="fill in the information">
                    </div>

                    <label class="col-2 col-form-label">Specialization</label>
                    <div class="col-10">
                        <input class="form-control" type="text" name="specialization" placeholder="fill in the information">
                    </div>


                    <label class="col-2 col-form-label">Score</label>
                    <div class="col-10">
                        <input class="form-control" type="number" name="score" placeholder="fill in the information">
                    </div>

                    <label class="col-2 col-form-label">Education start day</label>
                    <div class="col-10">
                        <input class="form-control" type="date" name="dateStart" >
                    </div>


                    <label class="col-2 col-form-label">Graduation day</label>
                    <div class="col-10">
                        <input class="form-control" type="date" name="dateEnd" >
                    </div>




                    <input class="btn btn-success pull-left" type="submit" value="Zapisz"/>

                </div>
            </div>
        </div>
    </section>

</div>

</form>
        <%@include file="../dynamic/footer.jspf"%>
    </body>
</html>
