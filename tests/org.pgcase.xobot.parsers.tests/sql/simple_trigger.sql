create
    trigger performd after insert
        or delete
            or update
                on
                tbl2 for each row execute procedure perform_d();