ACCOUNT=$(gcloud info --format='value(config.account)')
kubectl create clusterrolebinding owner-cluster-admin-binding \
--clusterrole cluster-admin \
--user $ACCOUNT

git clone https://github.com/scriptcamp/nginx-ingress-controller.git


kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.1.1/deploy/static/provider/cloud/deploy.yaml

kubectl create ns ingress-nginx

follow the files in ingressCtrlDir