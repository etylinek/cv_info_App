<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>

<form method="post" action='<c:url value="/exp/addExperience"/>'>
    <!-- Page Content-->
    <div class="container-fluid">
        <!-- Experience-->
        <section class="resume-section" id="experience">
            <div class="resume-section-content">
                <h2 class="mb-5">Add Experience</h2>
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="form-group row">
                        <label class="col-2 col-form-label">Stanowisko</label>
                        <div class="col-10">
                            <input class="form-control" type="text" name="position" placeholder="uzupełnij stanowisko">
                        </div>


                        <label class="col-2 col-form-label">Firma</label>
                        <div class="col-10">
                            <input class="form-control" type="text" name="company" placeholder="uzupełnij nazwe firmy">
                        </div>



                        <label class="col-2 col-form-label">Data rozpoczęcia pracy</label>
                        <div class="col-10">
                            <input class="form-control" type="date" name="dateStart" >
                        </div>


                        <label class="col-2 col-form-label">Data zakończenia pracy</label>
                        <div class="col-10">
                            <input class="form-control" type="date" name="dateEnd" >
                        </div>




                        <label class="col-2 col-form-label">Zakres obowiązków</label>
                        <div class="col-10">
                                    <textarea class="form-control" rows="5" name="description"
                                              placeholder="opis stanowiska"></textarea>
                        </div>


                        <input class="btn btn-success pull-left" type="submit" value="Zapisz"/>

                </div>
                </div>
            </div>
        </section>

    </div>

</form>
    <%@include file="../dynamic/footer.jspf" %>
    </body>
    </html>